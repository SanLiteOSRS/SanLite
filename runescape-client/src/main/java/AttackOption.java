import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dy")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	field1336(2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 97649280
	)
	static int field1339;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 834403033
	)
	@Export("port1")
	static int port1;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 741396013
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "966870433"
	)
	static int method2260(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			var3 = class139.getWidget(var4);
		} else {
			var3 = var2 ? FriendSystem.field905 : class4.field35;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class16.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			class29.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class16.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 5];
			class29.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class29.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class29.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				class16.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				class16.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				class29.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					NameableContainer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class43.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				class29.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) {
				var8 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				class392 var6 = (class392)UserComparator8.findEnumerated(class309.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					class29.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
					var3.field2727 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else if (var0 == 1128) {
					class16.Interpreter_intStackSize -= 2;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IIIZII)J",
		garbageValue = "-912001400"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(II)Lfb;",
		garbageValue = "1526631437"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = ItemLayer.method3269(GrandExchangeOfferOwnWorldComparator.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
