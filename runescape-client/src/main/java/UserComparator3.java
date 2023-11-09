import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ai")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqd;B)I",
		garbageValue = "-29"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1443426957"
	)
	static final float method2958(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 21
		return (1.0075567F * var1 - 75.56675F) / var1; // L: 22
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lil;I)V",
		garbageValue = "1453533170"
	)
	static void method2959(class211 var0) {
		if (var0 != null && var0.field2330 != null) { // L: 5213
			if (var0.field2330.childIndex >= 0) { // L: 5214
				Widget var1 = Interpreter.getWidget(var0.field2330.parentId); // L: 5215
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2330.childIndex >= var1.children.length || var0.field2330 != var1.children[var0.field2330.childIndex]) { // L: 5216
					return; // L: 5217
				}
			}

			if (var0.field2330.type == 11 && var0.field2329 == 0) { // L: 5220
				if (var0.field2330.method6481(var0.field2326, var0.field2328, 0, 0)) { // L: 5221
					switch(var0.field2330.method6463()) { // L: 5222
					case 0:
						class339.openURL(var0.field2330.method6465(), true, false); // L: 5244
						break;
					case 1:
						int var2 = class19.getWidgetFlags(var0.field2330); // L: 5225
						boolean var5 = (var2 >> 22 & 1) != 0; // L: 5227
						if (var5) { // L: 5229
							int[] var3 = var0.field2330.method6533(); // L: 5230
							if (var3 != null) { // L: 5231
								PacketBufferNode var4 = class217.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher); // L: 5232
								var4.packetBuffer.writeIntME(var0.field2330.childIndex); // L: 5233
								var4.packetBuffer.method9109(var3[1]); // L: 5234
								var4.packetBuffer.method9110(var0.field2330.method6464()); // L: 5235
								var4.packetBuffer.method9108(var3[2]); // L: 5236
								var4.packetBuffer.method9108(var3[0]); // L: 5237
								var4.packetBuffer.method9110(var0.field2330.id); // L: 5238
								Client.packetWriter.addNode(var4); // L: 5239
							}
						}
					}
				}
			} else if (var0.field2330.type == 12) { // L: 5249
				class329 var6 = var0.field2330.method6470(); // L: 5250
				if (var6 != null && var6.method6207()) { // L: 5251
					switch(var0.field2329) { // L: 5252
					case 0:
						Client.field734.method4225(var0.field2330); // L: 5254
						var6.method6386(true); // L: 5255
						var6.method6201(var0.field2326, var0.field2328, Client.field519.method4285(82), Client.field519.method4285(81)); // L: 5256
						break;
					case 1:
						var6.method6202(var0.field2326, var0.field2328); // L: 5259
					}
				}
			}

		}
	} // L: 5264

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "([Lme;II)V",
		garbageValue = "1918110614"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11907
			Widget var3 = var0[var2]; // L: 11908
			if (var3 != null) { // L: 11909
				if (var3.type == 0) { // L: 11910
					if (var3.children != null) { // L: 11911
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11912
					if (var4 != null) { // L: 11913
						class295.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11915
					var5 = new ScriptEvent(); // L: 11916
					var5.widget = var3; // L: 11917
					var5.args = var3.onDialogAbort; // L: 11918
					class170.runScriptEvent(var5); // L: 11919
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11921
					if (var3.childIndex >= 0) { // L: 11922
						Widget var6 = Interpreter.getWidget(var3.id); // L: 11923
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11924
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11928
					var5.widget = var3; // L: 11929
					var5.args = var3.onSubChange; // L: 11930
					class170.runScriptEvent(var5); // L: 11931
				}
			}
		}

	} // L: 11934
}
