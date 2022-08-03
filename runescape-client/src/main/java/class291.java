import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kq")
public class class291 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	UrlRequest field3330;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	SpritePixels field3327;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcc;)V"
	)
	class291(String var1, UrlRequester var2) {
		try {
			this.field3330 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3330 = null; // L: 19
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lcb;)V"
	)
	class291(UrlRequest var1) {
		this.field3330 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "-1693449318"
	)
	SpritePixels method5562() {
		if (this.field3327 == null && this.field3330 != null && this.field3330.isDone()) { // L: 28
			if (this.field3330.getResponse() != null) { // L: 29
				this.field3327 = class147.method3105(this.field3330.getResponse()); // L: 30
			}

			this.field3330 = null; // L: 32
		}

		return this.field3327; // L: 34
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)V",
		garbageValue = "2015320060"
	)
	public static void method5561(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqj;",
		garbageValue = "301348962"
	)
	static SpritePixels[] method5570() {
		SpritePixels[] var0 = new SpritePixels[class457.SpriteBuffer_spriteCount]; // L: 136

		for (int var1 = 0; var1 < class457.SpriteBuffer_spriteCount; ++var1) { // L: 137
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 138
			var2.width = class457.SpriteBuffer_spriteWidth; // L: 139
			var2.height = class457.SpriteBuffer_spriteHeight; // L: 140
			var2.xOffset = class267.SpriteBuffer_xOffsets[var1]; // L: 141
			var2.yOffset = class457.SpriteBuffer_yOffsets[var1]; // L: 142
			var2.subWidth = class457.SpriteBuffer_spriteWidths[var1]; // L: 143
			var2.subHeight = Decimator.SpriteBuffer_spriteHeights[var1]; // L: 144
			int var3 = var2.subWidth * var2.subHeight; // L: 145
			byte[] var4 = class436.SpriteBuffer_pixels[var1]; // L: 146
			var2.pixels = new int[var3]; // L: 147

			for (int var5 = 0; var5 < var3; ++var5) { // L: 148
				var2.pixels[var5] = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class267.SpriteBuffer_xOffsets = null; // L: 151
		class457.SpriteBuffer_yOffsets = null; // L: 152
		class457.SpriteBuffer_spriteWidths = null; // L: 153
		Decimator.SpriteBuffer_spriteHeights = null; // L: 154
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null; // L: 155
		class436.SpriteBuffer_pixels = null; // L: 156
		return var0; // L: 158
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "100"
	)
	static int method5563(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 868
		Widget var4;
		if (var0 >= 2000) { // L: 870
			var0 -= 1000; // L: 871
			var4 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 872
			var3 = false; // L: 873
		} else {
			var4 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 875
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 876
			var11 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] - 1; // L: 877
			if (var11 >= 0 && var11 <= 9) { // L: 878
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]); // L: 882
				return 1; // L: 883
			} else {
				--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 879
				return 1; // L: 880
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 885
				TaskHandler.Interpreter_intStackSize -= 2; // L: 886
				var11 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 887
				var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 888
				var4.parent = class293.getWidgetChild(var11, var6); // L: 889
				return 1; // L: 890
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 892
				var4.isScrollBar = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 893
				return 1; // L: 894
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 896
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 897
				return 1; // L: 898
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 900
				var4.dragThreshold = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 901
				return 1; // L: 902
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 904
				var4.dataText = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 905
				return 1; // L: 906
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 908
				var4.spellActionName = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 909
				return 1; // L: 910
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 912
				var4.actions = null; // L: 913
				return 1; // L: 914
			} else if (var0 == 1308) { // L: 916
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 917
				return 1; // L: 918
			} else if (var0 == 1309) { // L: 920
				--TaskHandler.Interpreter_intStackSize; // L: 921
				return 1; // L: 922
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 924
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 954
						TaskHandler.Interpreter_intStackSize -= 2; // L: 955
						var5 = 10; // L: 956
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]}; // L: 957
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]}; // L: 958
						RouteStrategy.Widget_setKey(var4, var5, var8, var9); // L: 959
						return 1; // L: 960
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 962
						TaskHandler.Interpreter_intStackSize -= 3; // L: 963
						var11 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] - 1; // L: 964
						var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 965
						var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 966
						if (var11 >= 0 && var11 <= 9) { // L: 967
							Widget_setKeyRate(var4, var11, var6, var7); // L: 970
							return 1; // L: 971
						} else {
							throw new RuntimeException(); // L: 968
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 973
						var5 = 10; // L: 974
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 975
						var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 976
						Widget_setKeyRate(var4, var5, var6, var7); // L: 977
						return 1; // L: 978
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 980
						--TaskHandler.Interpreter_intStackSize; // L: 981
						var11 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize] - 1; // L: 982
						if (var11 >= 0 && var11 <= 9) { // L: 983
							HealthBarUpdate.Widget_setKeyIgnoreHeld(var4, var11); // L: 986
							return 1; // L: 987
						} else {
							throw new RuntimeException(); // L: 984
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 989
						var5 = 10; // L: 990
						HealthBarUpdate.Widget_setKeyIgnoreHeld(var4, var5); // L: 991
						return 1; // L: 992
					} else {
						return 2; // L: 994
					}
				} else {
					byte[] var10 = null; // L: 925
					var8 = null; // L: 926
					if (var3) { // L: 927
						TaskHandler.Interpreter_intStackSize -= 10; // L: 928

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + TaskHandler.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 930 931
						}

						if (var7 > 0) { // L: 933
							var10 = new byte[var7 / 2]; // L: 934
							var8 = new byte[var7 / 2]; // L: 935

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 936
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + TaskHandler.Interpreter_intStackSize]; // L: 937
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + TaskHandler.Interpreter_intStackSize + 1]; // L: 938
							}
						}
					} else {
						TaskHandler.Interpreter_intStackSize -= 2; // L: 943
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]}; // L: 944
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]}; // L: 945
					}

					var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] - 1; // L: 947
					if (var7 >= 0 && var7 <= 9) { // L: 948
						RouteStrategy.Widget_setKey(var4, var7, var10, var8); // L: 951
						return 1; // L: 952
					} else {
						throw new RuntimeException(); // L: 949
					}
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIIB)V",
		garbageValue = "-71"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3447 == null) { // L: 1022
			throw new RuntimeException(); // L: 1023
		} else {
			var0.field3447[var1] = var2; // L: 1025
			var0.field3448[var1] = var3; // L: 1026
		}
	} // L: 1027
}
