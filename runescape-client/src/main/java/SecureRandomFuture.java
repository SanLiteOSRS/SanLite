import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("au")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ae")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2045980697"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1770543009"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "-53"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1197212946"
	)
	public static void method2163(AbstractArchive var0) {
		FloorUnderlayDefinition.field2112 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Luy;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 58
			var2 = (RunException)var0; // L: 59
			var2.message = var2.message + ' ' + var1; // L: 60
		} else {
			var2 = new RunException(var0, var1); // L: 62
		}

		return var2; // L: 63
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZS)I",
		garbageValue = "-1442"
	)
	static int method2162(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 573
		Widget var4;
		if (var0 >= 2000) { // L: 575
			var0 -= 1000; // L: 576
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 577
			var4 = class92.getWidget(var3); // L: 578
		} else {
			var4 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 580
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 581
			SoundCache.Interpreter_intStackSize -= 4; // L: 582
			var4.rawX = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 583
			var4.rawY = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 584
			var4.xAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 585
			var4.yAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 586
			class218.invalidateWidget(var4); // L: 587
			class219.client.alignWidget(var4); // L: 588
			if (var3 != -1 && var4.type == 0) { // L: 589
				Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 590
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 592
			SoundCache.Interpreter_intStackSize -= 4; // L: 593
			var4.rawWidth = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 594
			var4.rawHeight = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 595
			var4.widthAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 596
			var4.heightAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 597
			class218.invalidateWidget(var4); // L: 598
			class219.client.alignWidget(var4); // L: 599
			if (var3 != -1 && var4.type == 0) { // L: 600
				Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 603
			boolean var5 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 604
			if (var5 != var4.isHidden) { // L: 605
				var4.isHidden = var5; // L: 606
				class218.invalidateWidget(var4); // L: 607
			}

			return 1; // L: 609
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 611
			var4.noClickThrough = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 612
			return 1; // L: 613
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 615
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 616
			return 1; // L: 617
		} else {
			return 2; // L: 619
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IIIIIII)V",
		garbageValue = "-1694412552"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class30.method453(var1, var2, var3)) { // L: 148
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 149

			while (true) {
				var7 = var0.readUnsignedShort(); // L: 151
				if (var7 == 0) { // L: 152
					if (var1 == 0) { // L: 153
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 154
						int var11 = var4 + 932731; // L: 157
						int var12 = var5 + 556238; // L: 158
						int var13 = class141.method3100(var11 + 45365, 91923 + var12, 4) - 128 + (class141.method3100(10294 + var11, var12 + 37821, 2) - 128 >> 1) + (class141.method3100(var11, var12, 1) - 128 >> 2); // L: 160
						var13 = (int)((double)var13 * 0.3D) + 35; // L: 161
						if (var13 < 10) { // L: 162
							var13 = 10;
						} else if (var13 > 60) { // L: 163
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 166
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 168
					}
					break;
				}

				if (var7 == 1) { // L: 171
					int var8 = var0.readUnsignedByte(); // L: 172
					if (var8 == 1) { // L: 173
						var8 = 0;
					}

					if (var1 == 0) { // L: 174
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 175
					}
					break;
				}

				if (var7 <= 49) { // L: 178
					class227.field2543[var1][var2][var3] = (short)var0.readShort(); // L: 179
					class172.field1855[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 180
					ModelData0.field2833[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 181
				} else if (var7 <= 81) { // L: 184
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 185
				} else {
					Tiles.field1040[var1][var2][var3] = (short)(var7 - 81); // L: 188
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort(); // L: 193
				if (var7 == 0) { // L: 194
					break;
				}

				if (var7 == 1) { // L: 195
					var0.readUnsignedByte(); // L: 196
					break; // L: 197
				}

				if (var7 <= 49) { // L: 199
					var0.readShort(); // L: 200
				}
			}
		}

	} // L: 204

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-760322108"
	)
	public static int method2152(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 98
		return (var0 + var2) / var1 - var2; // L: 99
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-52"
	)
	static int method2166(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1572
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1573
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = HealthBarDefinition.Widget_unpackTargetMask(class194.getWidgetFlags(var3)); // L: 1574
			return 1; // L: 1575
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1577
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1584
				if (var3.dataText == null) { // L: 1585
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1586
				}

				return 1; // L: 1587
			} else {
				return 2; // L: 1589
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1578
			--var4; // L: 1579
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1580
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1581
			} else {
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1582
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldr;II)V",
		garbageValue = "1228067668"
	)
	static final void method2156(Actor var0, int var1) {
		HealthBar.worldToScreen(var0.x, var0.y, var1); // L: 5679
	} // L: 5680

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1763932419"
	)
	static void method2151(boolean var0) {
		Client.field673 = var0; // L: 12901
	} // L: 12902
}
