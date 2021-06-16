import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bf")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 501440191
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 179593907
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 724214627
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 775363577
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1416185027
	)
	int field937;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 50432371
	)
	int field944;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -663897917
	)
	int field939;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -709047569
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1448686013
	)
	int field941;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1441209589
	)
	int field943;
	@ObfuscatedName("i")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1984833823
	)
	int field945;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field939 = var2.field1801 * 128;
			this.field941 = var2.int5;
			this.field943 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field939 = 0;
			this.field941 = 0;
			this.field943 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			UserComparator7.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "706769109"
	)
	static int method1889(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]);
				return 1;
			} else {
				--UserComparator9.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var4.parent = class17.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--ChatChannel.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						ChatChannel.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]};
						UserComparator8.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						ChatChannel.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							FileSystem.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						FileSystem.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--ChatChannel.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class25.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class25.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						ChatChannel.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + ChatChannel.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + ChatChannel.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + ChatChannel.Interpreter_intStackSize + 1];
							}
						}
					} else {
						ChatChannel.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						UserComparator8.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
