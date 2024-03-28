import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1875987271
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 580288009
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1217689137
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2089744901
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1520454211
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1273210321
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1672181835
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1429640881
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLjd;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = DevicePcmPlayerProvider.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2396 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
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
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4232()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
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
				var2 = this.sequenceDefinition.method4232();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
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

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = MouseRecorder.getObjectDefinition(this.id); // L: 80
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 64
		int[] var3 = new int[4]; // L: 65
		var2[0] = var0; // L: 66
		var3[0] = var1; // L: 67
		int var4 = 1; // L: 68

		for (int var5 = 0; var5 < 4; ++var5) { // L: 69
			if (World.World_sortOption1[var5] != var0) { // L: 70
				var2[var4] = World.World_sortOption1[var5]; // L: 71
				var3[var4] = World.World_sortOption2[var5]; // L: 72
				++var4; // L: 73
			}
		}

		World.World_sortOption1 = var2; // L: 76
		World.World_sortOption2 = var3; // L: 77
		FloorUnderlayDefinition.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 78
	} // L: 79
}
