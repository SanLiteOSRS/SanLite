import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1675813545
	)
	@Export("id")
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1633530883
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1241662831
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 674628417
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1517344079
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1565729659
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 287551571
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -23705649
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1941838325
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1921562263
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1380116723
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("d")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("h")
	@Export("x")
	double x;
	@ObfuscatedName("a")
	@Export("y")
	double y;
	@ObfuscatedName("q")
	@Export("z")
	double z;
	@ObfuscatedName("c")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("f")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("y")
	@Export("speed")
	double speed;
	@ObfuscatedName("v")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("j")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2137407611
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2024563433
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Ljm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1681921945
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1329964451
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = Tiles.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = WorldMapRegion.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "81"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-28"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + this.speedZ * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			this.frameCycle += var1;

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
							return;
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Tiles.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		signature = "([Lhq;II)V",
		garbageValue = "-823007916"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !GrandExchangeOfferUnitPriceComparator.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && GrandExchangeOfferUnitPriceComparator.isComponentHidden(var3) && var3 != TriBool.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class58.method913(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = MusicPatch.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = WorldMapRegion.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field737; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class52.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2633 != 0 && !var3.isIf3) {
						int var8 = var3.field2633 >> 16;
						var5 = var3.field2633 << 16 >> 16;
						var8 *= Client.field737;
						var5 *= Client.field737;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class52.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
