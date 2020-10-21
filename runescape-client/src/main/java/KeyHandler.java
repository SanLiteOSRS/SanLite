import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		signature = "Lmi;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lbp;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cx")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cw")
	static int[] field435;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -975081949
	)
	static int field422;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 854592381
	)
	static int field423;
	@ObfuscatedName("cd")
	static char[] field424;
	@ObfuscatedName("cj")
	static int[] field425;
	@ObfuscatedName("cm")
	public static int[] field430;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 99767687
	)
	public static int field427;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1166391639
	)
	static int field415;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -440762137
	)
	static int field413;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1638279281
	)
	static int field428;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 49570399
	)
	@Export("KeyHandler_idleCycles")
	static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("co")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		signature = "Llv;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1074315087
	)
	@Export("menuWidth")
	static int menuWidth;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field435 = new int[128];
		field422 = 0;
		field423 = 0;
		field424 = new char[128];
		field425 = new int[128];
		field430 = new int[128];
		field427 = 0;
		field415 = 0;
		field413 = 0;
		field428 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	KeyHandler() {
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (field423 >= 0 && var2 >= 0) {
				field435[field423] = var2;
				field423 = field423 + 1 & 127;
				if (field422 == field423) {
					field423 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field413 + 1 & 127;
				if (var3 != field415) {
					field425[field413] = var2;
					field424[field413] = 0;
					field413 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field423 >= 0 && var2 >= 0) {
				field435[field423] = ~var2;
				field423 = field423 + 1 & 127;
				if (field422 == field423) {
					field423 = -1;
				}
			}
		}

		var1.consume();
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff') {
				boolean var3;
				if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
					var3 = true;
				} else {
					label58: {
						if (var2 != 0) {
							char[] var7 = class298.cp1252AsciiExtension;

							for (int var5 = 0; var5 < var7.length; ++var5) {
								char var6 = var7[var5];
								if (var2 == var6) {
									var3 = true;
									break label58;
								}
							}
						}

						var3 = false;
					}
				}

				if (var3) {
					int var4 = field413 + 1 & 127;
					if (var4 != field415) {
						field425[field413] = -1;
						field424[field413] = var2;
						field413 = var4;
					}
				}
			}
		}

		var1.consume();
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field423 = -1;
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	@ObfuscatedName("m")
	public static int method921(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(ILco;ZB)I",
		garbageValue = "3"
	)
	static int method934(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			var3 = UserComparator4.getWidget(var4);
		} else {
			var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			MilliClock.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 5];
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				MilliClock.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				MilliClock.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class171.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) {
				var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				class333 var6 = (class333)class195.findEnumerated(PacketWriter.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
					var3.field2627 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1840062887"
	)
	static final void method931() {
		Client.field795 = 0;
		int var0 = FloorDecoration.baseX * 64 + (PlayerType.localPlayer.x >> 7);
		int var1 = WorldMapData_0.baseY * 64 + (PlayerType.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field795 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field795 = 1;
		}

		if (Client.field795 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field795 = 0;
		}

	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-1824225693"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "82006207"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			ModelData0.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = ScriptFrame.method1228(var4);
					int var9 = (int)(var4 >>> 7 & 127L);
					Player var11 = Client.players[Client.combatTargetPlayerIndex];
					UserComparator3.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9);
				}

				return;
			}

			long var28 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var28 != var6) {
				label337: {
					var6 = var28;
					int var15 = ScriptFrame.method1228(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var16 = var15;
					long var19 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var18 = (int)(var19 >>> 7 & 127L);
					var18 = var18;
					int var30 = method921(ViewportMouse.ViewportMouse_entityTags[var8]);
					int var21 = StructDefinition.method4708(var8);
					if (var30 == 2 && ModeWhere.scene.getObjectFlags(GrandExchangeOfferUnitPriceComparator.Client_plane, var15, var18, var28) >= 0) {
						ObjectComposition var22 = ScriptEvent.getObjectDefinition(var21);
						if (var22.transforms != null) {
							var22 = var22.transform();
						}

						if (var22 == null) {
							break label337;
						}

						if (Client.isItemSelected == 1) {
							ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(65535) + var22.name, 1, var21, var15, var18);
						} else if (Client.isSpellSelected) {
							if ((class105.selectedSpellFlags & 4) == 4) {
								ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(65535) + var22.name, 2, var21, var15, var18);
							}
						} else {
							String[] var31 = var22.actions;
							if (var31 != null) {
								for (int var32 = 4; var32 >= 0; --var32) {
									if (var31[var32] != null) {
										short var25 = 0;
										if (var32 == 0) {
											var25 = 3;
										}

										if (var32 == 1) {
											var25 = 4;
										}

										if (var32 == 2) {
											var25 = 5;
										}

										if (var32 == 3) {
											var25 = 6;
										}

										if (var32 == 4) {
											var25 = 1001;
										}

										ModelData0.insertMenuItemNoShift(var31[var32], Client.colorStartTag(65535) + var22.name, var25, var21, var16, var18);
									}
								}
							}

							ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(65535) + var22.name, 1002, var22.id, var16, var18);
						}
					}

					int var23;
					NPC var24;
					Player var26;
					int[] var38;
					int var40;
					if (var30 == 1) {
						NPC var35 = Client.npcs[var21];
						if (var35 == null) {
							break label337;
						}

						if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) {
							for (var23 = 0; var23 < Client.npcCount; ++var23) {
								var24 = Client.npcs[Client.npcIndices[var23]];
								if (var24 != null && var35 != var24 && var24.definition.size == 1 && var24.x == var35.x && var35.y == var24.y) {
									class25.addNpcToMenu(var24.definition, Client.npcIndices[var23], var16, var18);
								}
							}

							var23 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var40 = 0; var40 < var23; ++var40) {
								var26 = Client.players[var38[var40]];
								if (var26 != null && var35.x == var26.x && var26.y == var35.y) {
									UserComparator3.addPlayerToMenu(var26, var38[var40], var16, var18);
								}
							}
						}

						class25.addNpcToMenu(var35.definition, var21, var16, var18);
					}

					if (var30 == 0) {
						Player var36 = Client.players[var21];
						if (var36 == null) {
							break label337;
						}

						if ((var36.x & 127) == 64 && (var36.y & 127) == 64) {
							for (var23 = 0; var23 < Client.npcCount; ++var23) {
								var24 = Client.npcs[Client.npcIndices[var23]];
								if (var24 != null && var24.definition.size == 1 && var36.x == var24.x && var36.y == var24.y) {
									class25.addNpcToMenu(var24.definition, Client.npcIndices[var23], var16, var18);
								}
							}

							var23 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var40 = 0; var40 < var23; ++var40) {
								var26 = Client.players[var38[var40]];
								if (var26 != null && var26 != var36 && var36.x == var26.x && var36.y == var26.y) {
									UserComparator3.addPlayerToMenu(var26, var38[var40], var16, var18);
								}
							}
						}

						if (var21 != Client.combatTargetPlayerIndex) {
							UserComparator3.addPlayerToMenu(var36, var21, var16, var18);
						} else {
							var4 = var28;
						}
					}

					if (var30 == 3) {
						NodeDeque var37 = Client.groundItems[GrandExchangeOfferUnitPriceComparator.Client_plane][var16][var18];
						if (var37 != null) {
							for (TileItem var41 = (TileItem)var37.first(); var41 != null; var41 = (TileItem)var37.next()) {
								ItemComposition var39 = AbstractWorldMapData.ItemDefinition_get(var41.id);
								if (Client.isItemSelected == 1) {
									ModelData0.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + Client.colorStartTag(16748608) + var39.name, 16, var41.id, var16, var18);
								} else if (Client.isSpellSelected) {
									if ((class105.selectedSpellFlags & 1) == 1) {
										ModelData0.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(16748608) + var39.name, 17, var41.id, var16, var18);
									}
								} else {
									String[] var33 = var39.groundActions;

									for (int var34 = 4; var34 >= 0; --var34) {
										if (var33 != null && var33[var34] != null) {
											byte var27 = 0;
											if (var34 == 0) {
												var27 = 18;
											}

											if (var34 == 1) {
												var27 = 19;
											}

											if (var34 == 2) {
												var27 = 20;
											}

											if (var34 == 3) {
												var27 = 21;
											}

											if (var34 == 4) {
												var27 = 22;
											}

											ModelData0.insertMenuItemNoShift(var33[var34], Client.colorStartTag(16748608) + var39.name, var27, var41.id, var16, var18);
										} else if (var34 == 2) {
											ModelData0.insertMenuItemNoShift("Take", Client.colorStartTag(16748608) + var39.name, 20, var41.id, var16, var18);
										}
									}

									ModelData0.insertMenuItemNoShift("Examine", Client.colorStartTag(16748608) + var39.name, 1004, var41.id, var16, var18);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}
}
