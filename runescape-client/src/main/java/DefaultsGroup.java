import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nm")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static final DefaultsGroup field4365;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -645648235
	)
	@Export("group")
	final int group;

	static {
		field4365 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-136151233"
	)
	public static int method6839(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;III)[Lqe;",
		garbageValue = "-1768448338"
	)
	public static IndexedSprite[] method6840(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class457.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class457.SpriteBuffer_spriteCount; ++var5) { // L: 27
				IndexedSprite var6 = var4[var5] = new IndexedSprite(); // L: 28
				var6.width = class457.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class457.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class457.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = InterfaceParent.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = class457.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = SoundCache.SpriteBuffer_spriteHeights[var5]; // L: 34
				var6.palette = class457.SpriteBuffer_spritePalette; // L: 35
				var6.pixels = class181.SpriteBuffer_pixels[var5]; // L: 36
			}

			class457.SpriteBuffer_xOffsets = null; // L: 39
			InterfaceParent.SpriteBuffer_yOffsets = null; // L: 40
			class457.SpriteBuffer_spriteWidths = null; // L: 41
			SoundCache.SpriteBuffer_spriteHeights = null; // L: 42
			class457.SpriteBuffer_spritePalette = null; // L: 43
			class181.SpriteBuffer_pixels = null; // L: 44
			return var4; // L: 48
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-97"
	)
	static int method6838(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3447
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3448
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = AttackOption.ItemComposition_get(var3).name; // L: 3449
			return 1; // L: 3450
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3452
				Nameable.Interpreter_intStackSize -= 2; // L: 3453
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3454
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3455
				var5 = AttackOption.ItemComposition_get(var3); // L: 3456
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3457
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3458
				}

				return 1; // L: 3459
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3461
				Nameable.Interpreter_intStackSize -= 2; // L: 3462
				var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3463
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3464
				var5 = AttackOption.ItemComposition_get(var3); // L: 3465
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3466
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3467
				}

				return 1; // L: 3468
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3470
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3471
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = AttackOption.ItemComposition_get(var3).price; // L: 3472
				return 1; // L: 3473
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3475
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3476
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = AttackOption.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 3477
				return 1; // L: 3478
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3480
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3481
					var7 = AttackOption.ItemComposition_get(var3); // L: 3482
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3483
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3; // L: 3484
					}

					return 1; // L: 3485
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3487
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3488
					var7 = AttackOption.ItemComposition_get(var3); // L: 3489
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3490
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3; // L: 3491
					}

					return 1; // L: 3492
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3494
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3495
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = AttackOption.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 3496
					return 1; // L: 3497
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3499
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3500
					var7 = AttackOption.ItemComposition_get(var3); // L: 3501
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3502
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3; // L: 3503
					}

					return 1; // L: 3504
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3506
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3507
					var7 = AttackOption.ItemComposition_get(var3); // L: 3508
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3509
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3; // L: 3510
					}

					return 1; // L: 3511
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3513
					String var6 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3514
					var4 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3515
					class138.findItemDefinitions(var6, var4 == 1); // L: 3516
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ScriptEvent.foundItemIdCount; // L: 3517
					return 1; // L: 3518
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3520
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3525
						class286.foundItemIndex = 0; // L: 3526
						return 1; // L: 3527
					} else if (var0 == 4213) { // L: 3529
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3530
						var4 = AttackOption.ItemComposition_get(var3).getShiftClickIndex(); // L: 3531
						if (var4 == -1) { // L: 3532
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4; // L: 3533
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4 + 1; // L: 3536
						}

						return 1; // L: 3538
					} else {
						return 2; // L: 3540
					}
				} else {
					if (class271.foundItemIds != null && class286.foundItemIndex < ScriptEvent.foundItemIdCount) { // L: 3521
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class271.foundItemIds[++class286.foundItemIndex - 1] & '\uffff'; // L: 3522
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3523
				}
			}
		}
	}
}
