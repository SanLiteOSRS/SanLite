import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public enum class231 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	field2460((byte)-1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	field2456((byte)0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	field2458((byte)1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	field2459((byte)2);

	@ObfuscatedName("aq")
	public byte field2457;

	class231(byte var3) {
		this.field2457 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2457; // L: 19
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Lve;",
		garbageValue = "-58"
	)
	static PrivateChatMode[] method4553() {
		return new PrivateChatMode[]{PrivateChatMode.field5314, PrivateChatMode.field5315, PrivateChatMode.field5316}; // L: 11
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 82
		if (var1 == null) { // L: 83
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 84 85
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;III)V",
		garbageValue = "1598075411"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3948
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3949
				SpriteMask var3 = var0.method6745(class380.field4414, true); // L: 3950
				if (var3 == null) { // L: 3951
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3952
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3953
				if (var3.contains(var4, var5)) { // L: 3954
					var4 -= var3.width / 2; // L: 3955
					var5 -= var3.height / 2; // L: 3956
					int var6 = Client.camAngleY & 2047; // L: 3957
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3958
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3959
					int var9 = var5 * var7 + var4 * var8 >> 11; // L: 3960
					int var10 = var8 * var5 - var7 * var4 >> 11; // L: 3961
					int var11 = var9 + class25.localPlayer.x >> 7; // L: 3962
					int var12 = class25.localPlayer.y - var10 >> 7; // L: 3963
					PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.field3203, Client.packetWriter.isaacCipher); // L: 3965
					var13.packetBuffer.writeByte(18); // L: 3966
					var13.packetBuffer.writeIntME(HealthBarDefinition.baseX * 64 + var11); // L: 3967
					var13.packetBuffer.method9427(WorldMapScaleHandler.baseY * 64 + var12); // L: 3968
					var13.packetBuffer.method9385(Client.field661.method4426(82) ? (Client.field661.method4426(81) ? 2 : 1) : 0); // L: 3969
					var13.packetBuffer.writeByte(var4); // L: 3970
					var13.packetBuffer.writeByte(var5); // L: 3971
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3972
					var13.packetBuffer.writeByte(57); // L: 3973
					var13.packetBuffer.writeByte(0); // L: 3974
					var13.packetBuffer.writeByte(0); // L: 3975
					var13.packetBuffer.writeByte(89); // L: 3976
					var13.packetBuffer.writeShort(class25.localPlayer.x); // L: 3977
					var13.packetBuffer.writeShort(class25.localPlayer.y); // L: 3978
					var13.packetBuffer.writeByte(63); // L: 3979
					Client.packetWriter.addNode(var13); // L: 3980
					Client.destinationX = var11; // L: 3981
					Client.destinationY = var12; // L: 3982
				}
			}

		}
	} // L: 3985

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IS)V",
		garbageValue = "255"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11824
			Widget var3 = var0[var2]; // L: 11825
			if (var3 != null) { // L: 11826
				if (var3.type == 0) { // L: 11827
					if (var3.children != null) { // L: 11828
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11829
					if (var4 != null) { // L: 11830
						WorldMapScaleHandler.method5149(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11832
					var5 = new ScriptEvent(); // L: 11833
					var5.widget = var3; // L: 11834
					var5.args = var3.onDialogAbort; // L: 11835
					WorldMapSectionType.runScriptEvent(var5); // L: 11836
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11838
					if (var3.childIndex >= 0) { // L: 11839
						Widget var6 = class380.field4414.method6348(var3.id); // L: 11840
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11841
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11845
					var5.widget = var3; // L: 11846
					var5.args = var3.onSubChange; // L: 11847
					WorldMapSectionType.runScriptEvent(var5); // L: 11848
				}
			}
		}

	} // L: 11851
}
