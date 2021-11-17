import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 193750031
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -198143099
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2072861117
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1279579483
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -817954883
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2037596073
	)
	@Export("height")
	int height;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2011716423
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 639704075
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("b")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = BZip2State.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = MouseHandler.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
				++this.frame;
				if (this.frame >= this.sequenceDefinition.frameIds.length) {
					this.isFinished = true;
					break;
				}
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhl;",
		garbageValue = "461766541"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = BZip2State.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-2056514813"
	)
	static int method1896(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lcx;IIII)V",
		garbageValue = "1361246201"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (HealthBarDefinition.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = HealthBarDefinition.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = MouseHandler.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = MouseHandler.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = MouseHandler.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = MouseHandler.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = MouseHandler.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = MouseHandler.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = MouseHandler.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = MouseHandler.colorStartTag(12648192);
					} else {
						var6 = MouseHandler.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class116.selectedSpellFlags & 8) == 8) {
						EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > HealthBarDefinition.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (HealthBarDefinition.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == HealthBarDefinition.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (AttackOption.field1226 == Client.playerAttackOption && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							EnumComposition.insertMenuItemNoShift(Client.playerMenuActions[var10], MouseHandler.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = MouseHandler.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}

	public GraphicsObject() {
	}
}
