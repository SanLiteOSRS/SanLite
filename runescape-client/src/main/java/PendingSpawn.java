import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = -1592702363
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ag")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1035256329
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1164604575
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1479469189
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1113436687
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 175413889
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1951305335
	)
	int field963;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -572899859
	)
	int field959;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1254625591
	)
	@Export("id")
	int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -802321491
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1436097175
	)
	int field962;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -326130097
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1413090507
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)Ljp;",
		garbageValue = "25"
	)
	public static FloorOverlayDefinition method1839(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)Lig;",
		garbageValue = "88"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class25.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIIII)I",
		garbageValue = "1776367578"
	)
	static final int method1841(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(ILco;ZB)I",
		garbageValue = "-42"
	)
	static int method1840(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var4 * var3;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else if (var0 == ScriptOpcodes.INTERPOLATE) {
			MilliClock.Interpreter_intStackSize -= 5;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3];
			int var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 4];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
			return 1;
		} else if (var0 == ScriptOpcodes.ADDPERCENT) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100;
			return 1;
		} else if (var0 == ScriptOpcodes.SETBIT) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 | 1 << var4;
			return 1;
		} else if (var0 == ScriptOpcodes.CLEARBIT) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
			return 1;
		} else if (var0 == ScriptOpcodes.TESTBIT) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.MOD) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 % var4;
			return 1;
		} else if (var0 == ScriptOpcodes.POW) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.INVPOW) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			if (var3 == 0) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				switch(var4) {
				case 0:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
					break;
				case 1:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3;
					break;
				case 2:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
					break;
				case 3:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
					break;
				case 4:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
					break;
				default:
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
				}

				return 1;
			}
		} else if (var0 == ScriptOpcodes.AND) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 & var4;
			return 1;
		} else if (var0 == ScriptOpcodes.OR) {
			MilliClock.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 | var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SCALE) {
			MilliClock.Interpreter_intStackSize -= 3;
			long var9 = (long)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			long var11 = (long)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			long var13 = (long)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		signature = "(Lht;B)Ljava/lang/String;",
		garbageValue = "-42"
	)
	static String method1843(Widget var0) {
		if (JagexCache.method3625(WorldMapData_0.getWidgetClickMask(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
