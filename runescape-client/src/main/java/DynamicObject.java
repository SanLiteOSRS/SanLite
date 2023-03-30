import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1550818127
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 644818899
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 636202351
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 891835891
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 820061589
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -198305785
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 819372407
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1368103957
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLiq;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = Coord.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2276 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
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
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4015()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "-1998422213"
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
				var2 = this.sequenceDefinition.method4015(); // L: 68
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

		ObjectComposition var12 = DecorativeObject.getObjectDefinition(this.id); // L: 80
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
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var4][var6] + var8[var5][var6] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lde;",
		garbageValue = "739326708"
	)
	static final InterfaceParent method2142(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11787
		var3.group = var1; // L: 11788
		var3.type = var2; // L: 11789
		Client.interfaceParents.put(var3, (long)var0); // L: 11790
		ApproximateRouteStrategy.Widget_resetModelFrames(var1); // L: 11791
		Widget var4 = WorldMapSection1.getWidget(var0); // L: 11792
		class69.invalidateWidget(var4); // L: 11793
		if (Client.meslayerContinueWidget != null) { // L: 11794
			class69.invalidateWidget(Client.meslayerContinueWidget); // L: 11795
			Client.meslayerContinueWidget = null; // L: 11796
		}

		class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11798
		WorldMapSection1.runWidgetOnLoadListener(var1); // L: 11799
		if (Client.rootInterface != -1) { // L: 11800
			NPCComposition.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11801
	}
}
