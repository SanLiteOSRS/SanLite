import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fj")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("i")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1205433047
	)
	@Export("type")
	final int type;
	@ObfuscatedName("o")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lfq;",
		garbageValue = "1715010895"
	)
	public static FloorOverlayDefinition method3677(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferUnitPriceComparator.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-216851091"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			class35.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfj;",
		garbageValue = "1780988355"
	)
	static WorldMapSectionType[] method3676() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-73"
	)
	static int method3668(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class302.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					WorldMapDecorationType.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--ChatChannel.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					ChatChannel.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--ChatChannel.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					UserComparator9.Interpreter_stringStackSize -= 2;
					--ChatChannel.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--UserComparator9.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class4.clientPreferences.windowMode = var3;
					Actor.savePreferences();
				}

				return 1;
			}
		}
	}
}
