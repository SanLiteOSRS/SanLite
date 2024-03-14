import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1498915709
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1466014013
	)
	@Export("type")
	int type;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1669798811
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -261301853
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1974606519
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 848916897
	)
	@Export("y")
	int y;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 797720763
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1213585525
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLky;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = MilliClock.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2272 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
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
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4065()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
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
				var2 = this.sequenceDefinition.method4065(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label81: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label81;
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

		ObjectComposition var12 = class127.getObjectDefinition(this.id); // L: 80
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
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var5][var6] + var8[var4][var6] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-172706412"
	)
	static final void method2248() {
		Scene.Scene_isLowDetail = false; // L: 912
		Client.isLowDetail = false; // L: 913
	} // L: 914
}
