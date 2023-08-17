import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1501685719
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -75702939
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -231241725
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 215686393
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 795738445
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1260218321
	)
	@Export("y")
	int y;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1287923743
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -714646065
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLik;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = EnumComposition.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2327 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4034()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4034(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label82: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label82;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = WorldMapElement.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "43"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-173700764"
	)
	static int method2186(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1523
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1524
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.itemId; // L: 1525
			return 1; // L: 1526
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1528
			if (var3.itemId != -1) { // L: 1529
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 1530
			}

			return 1; // L: 1531
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1533
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1534
			return 1; // L: 1535
		} else if (var0 == 1707) { // L: 1537
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.method6474() ? 1 : 0; // L: 1538
			return 1; // L: 1539
		} else if (var0 == 1708) { // L: 1541
			return WorldMapDecoration.method5480(var3); // L: 1542
		} else {
			return var0 == 1709 ? class390.method7221(var3) : 2; // L: 1544 1545 1547
		}
	}
}
