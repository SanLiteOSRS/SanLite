import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 303463081
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lew;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -445557769
	)
	@Export("element")
	int element;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lfi;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1466979619
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -392436281
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhk;Lhk;ILew;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-88183345"
	)
	@Export("init")
	void init() {
		this.element = class19.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(ByteArrayPool.WorldMapElement_get(this.element));
		WorldMapElement var1 = ByteArrayPool.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-52"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Lfi;",
		garbageValue = "634413820"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1975622360"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1420825097"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "637154064"
	)
	public static void method2699() {
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field264 = KeyHandler.field271;
			KeyHandler.field263 = 0;
			int var1;
			if (KeyHandler.field259 < 0) {
				for (var1 = 0; var1 < 112; ++var1) {
					KeyHandler.KeyHandler_pressedKeys[var1] = false;
				}

				KeyHandler.field259 = KeyHandler.field258;
			} else {
				while (KeyHandler.field259 != KeyHandler.field258) {
					var1 = KeyHandler.field257[KeyHandler.field258];
					KeyHandler.field258 = KeyHandler.field258 + 1 & 127;
					if (var1 < 0) {
						KeyHandler.KeyHandler_pressedKeys[~var1] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field263 < KeyHandler.field262.length - 1) {
							KeyHandler.field262[++KeyHandler.field263 - 1] = var1;
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true;
					}
				}
			}

			if (KeyHandler.field263 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field271 = KeyHandler.field265;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "([BB)Lcc;",
		garbageValue = "40"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				int var9;
				int var11;
				if (var8 > 0) {
					var11 = var8 - 1;
					var11 |= var11 >>> 1;
					var11 |= var11 >>> 2;
					var11 |= var11 >>> 4;
					var11 |= var11 >>> 8;
					var11 |= var11 >>> 16;
					int var10 = var11 + 1;
					var9 = var10;
				} else {
					var9 = 1;
				}

				IterableNodeHashTable var13 = new IterableNodeHashTable(var9);
				var1.switches[var7] = var13;

				while (var8-- > 0) {
					var11 = var2.readInt();
					int var12 = var2.readInt();
					var13.put(new IntegerNode(var12), (long)var11);
				}
			}
		}

		var2.offset = 0;
		var1.field1058 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}
}
