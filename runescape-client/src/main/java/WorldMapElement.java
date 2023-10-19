import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lhp;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("Ignored_cached")
	static EvictingDualNodeHashTable Ignored_cached;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 630978191
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -155660001
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1902822735
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 991166161
	)
	public int field1953;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 500717297
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("aa")
	public boolean field1940;
	@ObfuscatedName("ap")
	public boolean field1941;
	@ObfuscatedName("ay")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("as")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("aj")
	int[] field1944;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1590449517
	)
	int field1945;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1554669035
	)
	int field1950;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1120622997
	)
	int field1937;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1398924561
	)
	int field1948;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("az")
	int[] field1946;
	@ObfuscatedName("at")
	byte[] field1952;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -430204521
	)
	@Export("category")
	public int category;

	static {
		Ignored_cached = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1940 = true; // L: 24
		this.field1941 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1945 = Integer.MAX_VALUE; // L: 29
		this.field1950 = Integer.MAX_VALUE; // L: 30
		this.field1937 = Integer.MIN_VALUE; // L: 31
		this.field1948 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "7"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "-63"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9223();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9223();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1953 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1940 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1941 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1944 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1944[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1946 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1946.length; ++var5) { // L: 83
					this.field1946[var5] = var1.readInt();
				}

				this.field1952 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1952[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9223(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method9223(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					this.horizontalAlignment = (HorizontalAlignment)SequenceDefinition.findEnumerated(class202.method3767(), var1.readUnsignedByte()); // L: 115
				} else if (var2 == 30) { // L: 117
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2096, VerticalAlignment.field2094}; // L: 120
					this.verticalAlignment = (VerticalAlignment)SequenceDefinition.findEnumerated(var3, var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	public void method3666() {
		if (this.field1944 != null) { // L: 128
			for (int var1 = 0; var1 < this.field1944.length; var1 += 2) { // L: 129
				if (this.field1944[var1] < this.field1945) { // L: 130
					this.field1945 = this.field1944[var1];
				} else if (this.field1944[var1] > this.field1937) { // L: 131
					this.field1937 = this.field1944[var1];
				}

				if (this.field1944[var1 + 1] < this.field1950) { // L: 132
					this.field1950 = this.field1944[var1 + 1];
				} else if (this.field1944[var1 + 1] > this.field1948) {
					this.field1948 = this.field1944[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lud;",
		garbageValue = "794347545"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lud;",
		garbageValue = "-97"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 144
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)Ignored_cached.get((long)var1); // L: 145
			if (var2 != null) { // L: 146
				return var2;
			} else {
				var2 = class47.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					Ignored_cached.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "2010949873"
	)
	static int method3660(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2876
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2877
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field755.method4280(var3) ? 1 : 0; // L: 2878
			return 1; // L: 2879
		} else if (var0 == 3501) { // L: 2881
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2882
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field755.method4272(var3) ? 1 : 0; // L: 2883
			return 1; // L: 2884
		} else if (var0 == 3502) { // L: 2886
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2887
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field755.method4259(var3) ? 1 : 0; // L: 2888
			return 1; // L: 2889
		} else {
			return 2; // L: 2891
		}
	}
}
