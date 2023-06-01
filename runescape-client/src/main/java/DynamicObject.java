import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -1218915345
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1374360927
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1027781115
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1163246543
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1760497209
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1299131959
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1567388587
	)
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 375747155
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 228102707
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLib;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class149.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2277 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4006());
				}
			}
		}

	} // L: 48

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4006();
				this.frame += var1;
				var1 = 0; // L: 70
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label79: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label79;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class59.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) {
			var12 = var12.transform(); // L: 81
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "51"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 38
		boolean var3 = false; // L: 39
		int var4 = 0; // L: 40
		int var5 = var0.length(); // L: 41
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 71
				break;
			}

			label83: {
				char var7 = var0.charAt(var6); // L: 43
				if (var6 == 0) { // L: 44
					if (var7 == '-') { // L: 45
						var2 = true; // L: 46
						break label83;
					}

					if (var7 == '+') { // L: 49
						break label83;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 51
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 52
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 53
						var1 = false; // L: 55
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 58
					var1 = false; // L: 59
					break; // L: 60
				}

				if (var2) { // L: 62
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10; // L: 63
				if (var4 != var8 / 10) { // L: 64
					var1 = false; // L: 65
					break; // L: 66
				}

				var4 = var8; // L: 68
				var3 = true; // L: 69
			}

			++var6; // L: 42
		}

		return var1; // L: 73
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "([Lmo;II)V",
		garbageValue = "-1800843459"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11918
			Widget var3 = var0[var2]; // L: 11919
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !UserComparator9.isComponentHidden(var3))) { // L: 11920 11921 11922
				int var5;
				if (var3.type == 0) { // L: 11923
					if (!var3.isIf3 && UserComparator9.isComponentHidden(var3) && var3 != class216.mousedOverWidgetIf1) { // L: 11924
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11925
					if (var3.children != null) { // L: 11926
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11927
					if (var4 != null) { // L: 11928
						var5 = var4.group; // L: 11929
						if (WorldMapAreaData.loadInterface(var5)) { // L: 11931
							drawModelComponents(UserComparator6.Widget_interfaceComponents[var5], -1); // L: 11932
						}
					}
				}

				if (var3.type == 6) { // L: 11936
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11937
						boolean var8 = HitSplatDefinition.runCs1(var3); // L: 11938
						if (var8) { // L: 11940
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11941
						}

						if (var5 != -1) { // L: 11942
							SequenceDefinition var6 = class149.SequenceDefinition_get(var5); // L: 11943
							if (!var6.isCachedModelIdSet()) { // L: 11944
								for (var3.modelFrameCycle += Client.field558; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; HorizontalAlignment.invalidateWidget(var3)) { // L: 11945 11946 11953
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11947
									++var3.modelFrame; // L: 11948
									if (var3.modelFrame >= var6.frameIds.length) { // L: 11949
										var3.modelFrame -= var6.frameCount; // L: 11950
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11951
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field558; // L: 11957
								int var7 = var6.method4006(); // L: 11958
								if (var3.modelFrame >= var7) { // L: 11959
									var3.modelFrame -= var6.frameCount; // L: 11960
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 11961
										var3.modelFrame = 0;
									}
								}

								HorizontalAlignment.invalidateWidget(var3); // L: 11963
							}
						}
					}

					if (var3.field3665 != 0 && !var3.isIf3) { // L: 11967
						int var9 = var3.field3665 >> 16; // L: 11968
						var5 = var3.field3665 << 16 >> 16; // L: 11969
						var9 *= Client.field558; // L: 11970
						var5 *= Client.field558; // L: 11971
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 11972
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11973
						HorizontalAlignment.invalidateWidget(var3); // L: 11974
					}
				}
			}
		}

	} // L: 11978
}
