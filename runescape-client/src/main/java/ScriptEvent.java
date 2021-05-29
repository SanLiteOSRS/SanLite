import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cz")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("v")
	@Export("args")
	Object[] args;
	@ObfuscatedName("n")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1064015207
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 334920693
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2026444209
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1025309887
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -754868141
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("s")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 820352111
	)
	int field1180;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 487377745
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1143010333"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "566555821"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1244600055"
	)
	static String method2086() {
		return ObjectComposition.clientPreferences.hideUsername ? class6.method67(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "0"
	)
	static int method2093(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "-1497241252"
	)
	static final void method2094(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field685; ++var1) {
			int var2 = Client.field686[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			int var6;
			int var7;
			if ((var4 & 32) != 0) {
				var5 = var0.method6603();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.method6549();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = LoginScreenAnimation.SequenceDefinition_get(var5).field1891;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1245 = 0;
					}

					if (var7 == 2) {
						var3.field1245 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || LoginScreenAnimation.SequenceDefinition_get(var5).field1885 >= LoginScreenAnimation.SequenceDefinition_get(var3.sequence).field1885) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1245 = 0;
					var3.field1274 = var3.pathLength;
				}
			}

			int var8;
			if ((var4 & 8) != 0) {
				var5 = var0.method6605();
				var6 = var0.readUnsignedShort();
				var7 = var3.x - (var5 - VertexNormal.baseX * 64 - VertexNormal.baseX * 64) * 64;
				var8 = var3.y - (var6 - SoundSystem.baseY * 64 - SoundSystem.baseY * 64) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1264 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 2) != 0) {
				var3.definition = StructComposition.getNpcDefinition(var0.method6603());
				var3.field1239 = var3.definition.size;
				var3.field1289 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}

			if ((var4 & 1) != 0) {
				var3.targetIndex = var0.method6603();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 128) != 0) {
				var3.field1278 = var0.method6597();
				var3.field1280 = var0.method6597();
				var3.field1269 = var0.method6559();
				var3.field1238 = var0.method6593();
				var3.field1265 = var0.method6604() + Client.cycle;
				var3.field1283 = var0.method6603() + Client.cycle;
				var3.field1284 = var0.method6604();
				var3.pathLength = 1;
				var3.field1274 = 0;
				var3.field1278 += var3.pathX[0];
				var3.field1280 += var3.pathY[0];
				var3.field1269 += var3.pathX[0];
				var3.field1238 += var3.pathY[0];
			}

			if ((var4 & 64) != 0) {
				var5 = var0.method6549();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.method6671();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.method6671();
							int var12 = var9 > 0 ? var0.method6549() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 4) != 0) {
				var3.spotAnimation = var0.method6605();
				var5 = var0.method6598();
				var3.field1277 = var5 >> 16;
				var3.field1287 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1287 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 16) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}
		}

	}
}
