import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -620929205
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1503104185
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1281749377
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -856181149
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2061408833
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -722624469
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -578493745
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1349240519
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 383721093
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1902000949
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -770535721
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("b")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("i")
	@Export("x")
	double x;
	@ObfuscatedName("k")
	@Export("y")
	double y;
	@ObfuscatedName("g")
	@Export("z")
	double z;
	@ObfuscatedName("t")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("x")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("u")
	@Export("speed")
	double speed;
	@ObfuscatedName("q")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("s")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -9873959
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -909606039
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2026775219
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -472667051
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
			this.sequenceDefinition = WorldMapScaleHandler.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-4"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1411274037"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += this.speedY * (double)var1;
		this.z += this.speedZ * (double)var1 + 0.5D * this.accelerationZ * (double)var1 * (double)var1;
		this.speedZ += (double)var1 * this.accelerationZ;
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-530547820"
	)
	public static void method2075() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-114"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class1.client.method672();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field811 = 0;
				Client.field654 = 0;
				Client.timer.method5675(var0);
				if (var0 != 20) {
					class19.method281(false);
				}
			}

			if (var0 != 20 && var0 != 40 && DefaultsGroup.field3887 != null) {
				DefaultsGroup.field3887.close();
				DefaultsGroup.field3887 = null;
			}

			if (Client.gameState == 25) {
				Client.field678 = 0;
				Client.field618 = 0;
				Client.field789 = 1;
				Client.field742 = 0;
				Client.field677 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					DesktopPlatformInfoProvider.method6109(JagexCache.archive10, ModeWhere.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					DesktopPlatformInfoProvider.method6109(JagexCache.archive10, ModeWhere.archive8, false, 4);
				} else if (class377.clearLoginScreen) {
					Coord.titleboxSprite = null;
					class289.titlebuttonSprite = null;
					Login.runesSprite = null;
					class339.leftTitleSprite = null;
					class377.rightTitleSprite = null;
					Messages.logoSprite = null;
					GrandExchangeEvents.title_muteSprite = null;
					Login.options_buttons_0Sprite = null;
					WorldMapCacheName.options_buttons_2Sprite = null;
					Varcs.worldSelectBackSprites = null;
					class364.worldSelectFlagSprites = null;
					class10.worldSelectArrows = null;
					Huffman.worldSelectStars = null;
					class35.field244 = null;
					PendingSpawn.loginScreenRunesAnimation.method2296();
					PcmPlayer.method856(2);
					class105.method2358(true);
					class377.clearLoginScreen = false;
				}
			} else {
				DesktopPlatformInfoProvider.method6109(JagexCache.archive10, ModeWhere.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}
}
