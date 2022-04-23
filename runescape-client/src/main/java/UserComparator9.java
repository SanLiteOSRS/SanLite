import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("de")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -976382879
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnf;Lnf;I)I",
		garbageValue = "-1564138205"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-27"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ldt;FZI)F",
		garbageValue = "1213299067"
	)
	static float method2616(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2715() != 0) {
			float var4 = (float)var0.field1411[0].field1373;
			float var5 = (float)var0.field1411[var0.method2715() - 1].field1373;
			float var6 = var5 - var4;
			if (0.0D == (double)var6) {
				return var0.field1411[0].field1376;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var10 * var6;
				var8 = Math.abs(1.0D + var8);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1409 == class116.field1401) {
						if (0.0D != (double)var10) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1409 != class116.field1400 && var0.field1409 != class116.field1406) {
						if (var0.field1409 == class116.field1399) {
							var11 = var4 - var1;
							var16 = var0.field1411[0].field1371;
							var17 = var0.field1411[0].field1377;
							var3 = var0.field1411[0].field1376;
							if ((double)var16 != 0.0D) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1410 == class116.field1401) {
					if (0.0D != (double)var10) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1410 != class116.field1400 && var0.field1410 != class116.field1406) {
					if (var0.field1410 == class116.field1399) {
						var11 = var1 - var5;
						var16 = var0.field1411[var0.method2715() - 1].field1369;
						var17 = var0.field1411[var0.method2715() - 1].field1374;
						var3 = var0.field1411[var0.method2715() - 1].field1376;
						if ((double)var16 != 0.0D) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = class10.method92(var0, var11);
				float var18;
				if (var2 && var0.field1409 == class116.field1406) {
					var18 = var0.field1411[var0.method2715() - 1].field1376 - var0.field1411[0].field1376;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1410 == class116.field1406) {
					var18 = var0.field1411[var0.method2715() - 1].field1376 - var0.field1411[0].field1376;
					var3 = (float)((double)var3 + (double)var18 * var8);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "2"
	)
	static int method2621(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var3 = class127.getWidget(var4);
		} else {
			var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			class346.method6449(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
			class346.method6449(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class346.method6449(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class346.method6449(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				class346.method6449(var3);
				if (var4 != -1 && var3.type == 0) {
					AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class268.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class346.method6449(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class346.method6449(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class346.method6449(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class346.method6449(var3);
				return 1;
			} else if (var0 == 1125) {
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				class448 var6 = (class448)MusicPatchPcmStream.findEnumerated(class291.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					class346.method6449(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					var3.field3369 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					Interpreter.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 1129) {
					var3.field3487 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					class346.method6449(var3);
					return 1;
				} else if (var0 == 1130) {
					var3.method5618(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize], VerticalAlignment.urlRequester, MusicPatchPcmStream.method5456());
					return 1;
				} else if (var0 == 1131) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3.method5722(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
					return 1;
				} else if (var0 == 1132) {
					var3.method5672(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "74"
	)
	static final int method2615(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class293.method5599(var3, var5);
		int var8 = class293.method5599(var3 + 1, var5);
		int var9 = class293.method5599(var3, var5 + 1);
		int var10 = class293.method5599(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16);
		return var15;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)I",
		garbageValue = "-1509768740"
	)
	static int method2617(Widget var0) {
		if (var0.type != 11) {
			--class122.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method5623(var1);
			return 1;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1180428712"
	)
	protected static final void method2619() {
		class431.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		TriBool.gameCyclesToDo = 0;
	}
}
