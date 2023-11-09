import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ij")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 673523519
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1046620565
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1891808843
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1231900861
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "16"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field2983.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort() * 64; // L: 20
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method8568(); // L: 28
			super.fileId = var1.method8568(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1703912011"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 34
		super.floorUnderlayIds = new short[1][64][64]; // L: 35
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field2950 = new byte[super.planes][64][64]; // L: 37
		super.field2951 = new byte[super.planes][64][64]; // L: 38
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class251.field2977.value) { // L: 41
			throw new IllegalStateException(""); // L: 42
		} else {
			int var3 = var1.readUnsignedByte(); // L: 44
			int var4 = var1.readUnsignedByte(); // L: 45
			int var5 = var1.readUnsignedByte(); // L: 46
			int var6 = var1.readUnsignedByte(); // L: 47
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 48
				for (int var7 = 0; var7 < 8; ++var7) { // L: 51
					for (int var8 = 0; var8 < 8; ++var8) { // L: 52
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 53
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 49
			}
		}
	} // L: 56

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1726020547"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "660980173"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1808236663"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1429277578"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 60
			return false; // L: 61
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 63
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) { // L: 64
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "-55"
	)
	static int method5162(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 575
		Widget var4;
		if (var0 >= 2000) { // L: 577
			var0 -= 1000; // L: 578
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 579
			var4 = class175.getWidget(var3); // L: 580
		} else {
			var4 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 582
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 583
			class87.Interpreter_intStackSize -= 4; // L: 584
			var4.rawX = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 585
			var4.rawY = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 586
			var4.xAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 587
			var4.yAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 588
			class69.invalidateWidget(var4); // L: 589
			BuddyRankComparator.client.alignWidget(var4); // L: 590
			if (var3 != -1 && var4.type == 0) { // L: 591
				class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 592
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 594
			class87.Interpreter_intStackSize -= 4; // L: 595
			var4.rawWidth = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 596
			var4.rawHeight = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 597
			var4.widthAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 598
			var4.heightAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 599
			class69.invalidateWidget(var4); // L: 600
			BuddyRankComparator.client.alignWidget(var4); // L: 601
			if (var3 != -1 && var4.type == 0) { // L: 602
				class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 603
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 605
			boolean var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 606
			if (var5 != var4.isHidden) { // L: 607
				var4.isHidden = var5; // L: 608
				class69.invalidateWidget(var4); // L: 609
			}

			return 1; // L: 611
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 613
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 614
			return 1; // L: 615
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 617
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 618
			return 1; // L: 619
		} else {
			return 2; // L: 621
		}
	}
}
