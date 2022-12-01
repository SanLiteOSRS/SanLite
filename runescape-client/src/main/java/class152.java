import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("em")
public class class152 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 4468933996326418919L
	)
	long field1714;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -5363108246206814043L
	)
	long field1717;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	IterableNodeDeque field1716;

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public class152(Buffer var1) {
		this.field1717 = -1L; // L: 10
		this.field1716 = new IterableNodeDeque(); // L: 11
		this.method3187(var1); // L: 19
	} // L: 20

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1930306578"
	)
	void method3187(Buffer var1) {
		this.field1714 = var1.readLong(); // L: 23
		this.field1717 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class147(this);
			} else if (var2 == 4) {
				var3 = new class158(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class143(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class141(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class148(this);
			}

			((class151)var3).vmethod3238(var1); // L: 34
			this.field1716.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "1696123227"
	)
	public void method3182(ClanChannel var1) {
		if (this.field1714 == var1.key && var1.field1729 == this.field1717) { // L: 41
			for (class151 var2 = (class151)this.field1716.last(); var2 != null; var2 = (class151)this.field1716.previous()) { // L: 42
				var2.vmethod3239(var1); // L: 43
			}

			++var1.field1729; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)Z",
		garbageValue = "-1888501189"
	)
	static boolean method3186(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 769
			int[] var1 = var0.transforms; // L: 771

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 772
				int var3 = var1[var2]; // L: 773
				ObjectComposition var4 = InterfaceParent.getObjectDefinition(var3); // L: 775
				if (var4.mapIconId != -1) { // L: 776
					return true; // L: 777
				}
			}
		} else if (var0.mapIconId != -1) { // L: 783
			return true; // L: 784
		}

		return false; // L: 786
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1894804374"
	)
	static int method3188(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4159
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class13.getWindowedMode(); // L: 4160
			return 1; // L: 4161
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4163
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4164
				if (var3 == 1 || var3 == 2) { // L: 4165
					class167.setWindowedMode(var3);
				}

				return 1; // L: 4166
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4168
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2401(); // L: 4169
				return 1; // L: 4170
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4172
				if (var0 == 5310) { // L: 4179
					--class379.Interpreter_intStackSize; // L: 4180
					return 1; // L: 4181
				} else {
					return 2; // L: 4183
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4173
				if (var3 == 1 || var3 == 2) { // L: 4174
					BufferedSink.clientPreferences.method2453(var3); // L: 4175
				}

				return 1; // L: 4177
			}
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lkn;III)V",
		garbageValue = "-1599773392"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3911
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3912
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3913
				if (var3 == null) { // L: 3914
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3915
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3916
				if (var3.contains(var4, var5)) { // L: 3917
					var4 -= var3.width / 2; // L: 3918
					var5 -= var3.height / 2; // L: 3919
					int var6 = Client.camAngleY & 2047; // L: 3920
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3921
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3922
					int var9 = var4 * var8 + var7 * var5 >> 11; // L: 3923
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3924
					int var11 = var9 + class296.localPlayer.x >> 7; // L: 3925
					int var12 = class296.localPlayer.y - var10 >> 7; // L: 3926
					PacketBufferNode var13 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3009, Client.packetWriter.isaacCipher); // L: 3928
					var13.packetBuffer.writeByte(18); // L: 3929
					var13.packetBuffer.method8443(class158.baseY * 64 + var12); // L: 3930
					var13.packetBuffer.method8546(Client.field733.method3956(82) ? (Client.field733.method3956(81) ? 2 : 1) : 0); // L: 3931
					var13.packetBuffer.method8619(class26.baseX * 64 + var11); // L: 3932
					var13.packetBuffer.writeByte(var4); // L: 3933
					var13.packetBuffer.writeByte(var5); // L: 3934
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3935
					var13.packetBuffer.writeByte(57); // L: 3936
					var13.packetBuffer.writeByte(0); // L: 3937
					var13.packetBuffer.writeByte(0); // L: 3938
					var13.packetBuffer.writeByte(89); // L: 3939
					var13.packetBuffer.writeShort(class296.localPlayer.x); // L: 3940
					var13.packetBuffer.writeShort(class296.localPlayer.y); // L: 3941
					var13.packetBuffer.writeByte(63); // L: 3942
					Client.packetWriter.addNode(var13); // L: 3943
					Client.destinationX = var11; // L: 3944
					Client.destinationY = var12; // L: 3945
				}
			}

		}
	} // L: 3948
}
