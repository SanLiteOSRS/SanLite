import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("et")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	public static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static EvictingDualNodeHashTable field1606;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("WorldMapElement_cachedSprites")
	static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
	@ObfuscatedName("eq")
	static int[] field1603;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1268318299
	)
	public int field1596;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -786020391
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1840545813
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2113389855
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -490506125
	)
	public int field1608;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 181606605
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -714777503
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1753833631
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -567773935
	)
	@Export("width")
	public int width;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1691333321
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		field1606 = new EvictingDualNodeHashTable(64);
		WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1608 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1613150424"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "98"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method6583();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method6583();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Loh;",
		garbageValue = "-48"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)WorldMapElement_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0);
				if (var1 != null) {
					WorldMapElement_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)Loh;",
		garbageValue = "-6435"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)WorldMapElement_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0);
				if (var1 != null) {
					WorldMapElement_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "459943946"
	)
	public static long method2720(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "42"
	)
	static final int method2728(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-849038542"
	)
	static int method2727(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else if (var0 != 5631 && var0 != 5633) {
			if (var0 == 5632) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 26;
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2;
			return 1;
		}
	}
}
