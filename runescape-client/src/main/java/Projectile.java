import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -1106968031
	)
	static int field937;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1715665897
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 950599391
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1474959745
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1673087401
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1451961285
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1112467891
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1278515723
	)
	int field960;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 799813617
	)
	int field938;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -499492361
	)
	int field945;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1803322589
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -605935351
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -822202755
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -584446471
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -489123553
	)
	int field950;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 868463931
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ak")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("aj")
	@Export("x")
	double x;
	@ObfuscatedName("am")
	@Export("y")
	double y;
	@ObfuscatedName("aq")
	@Export("z")
	double z;
	@ObfuscatedName("ai")
	double field956;
	@ObfuscatedName("aw")
	double field957;
	@ObfuscatedName("ae")
	double field944;
	@ObfuscatedName("an")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ag")
	double field943;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -777446121
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1808297649
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 93342027
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1377913919
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 24
		this.frame = 0; // L: 36
		this.frameCycle = 0; // L: 37
		this.id = var1; // L: 40
		this.plane = var2; // L: 41
		this.sourceX = var3; // L: 42
		this.sourceY = var4; // L: 43
		this.sourceZ = var5; // L: 44
		this.cycleStart = var6; // L: 45
		this.cycleEnd = var7; // L: 46
		this.slope = var8; // L: 47
		this.startHeight = var9; // L: 48
		this.targetIndex = var10; // L: 49
		this.endHeight = var11; // L: 50
		this.isMoving = false; // L: 51
		int var12 = Canvas.SpotAnimationDefinition_get(this.id).sequence; // L: 52
		if (var12 != -1) { // L: 53
			this.sequenceDefinition = DynamicObject.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 54
		}

	} // L: 55

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12); // L: 58
		this.field950 = var10; // L: 59
	} // L: 60

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "34043964"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field960 = var1; // L: 63
		this.field938 = var2; // L: 64
		this.field945 = var3; // L: 65
		double var5;
		if (!this.isMoving) { // L: 66
			var5 = (double)(this.field960 - this.sourceX); // L: 67
			double var7 = (double)(this.field938 - this.sourceY); // L: 68
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 69
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9; // L: 70
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY; // L: 71
			this.z = (double)this.sourceZ; // L: 72
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 74
		this.field956 = ((double)this.field960 - this.x) / var5; // L: 75
		this.field957 = ((double)this.field938 - this.y) / var5; // L: 76
		this.field944 = Math.sqrt(this.field957 * this.field957 + this.field956 * this.field956); // L: 77
		if (!this.isMoving) { // L: 78
			this.speedZ = -this.field944 * Math.tan(0.02454369D * (double)this.slope);
		}

		this.field943 = 2.0D * ((double)this.field945 - this.z - this.speedZ * var5) / (var5 * var5); // L: 79
	} // L: 80

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Canvas.SpotAnimationDefinition_get(this.id); // L: 113
		Model var2 = var1.getModel(this.frame); // L: 114
		if (var2 == null) { // L: 115
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 116
			return var2; // L: 117
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1019112167"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 83
		this.x += (double)var1 * this.field956; // L: 84
		this.y += (double)var1 * this.field957; // L: 85
		this.z += (double)var1 * this.speedZ + (double)var1 * (double)var1 * 0.5D * this.field943; // L: 86
		this.speedZ += this.field943 * (double)var1; // L: 87
		this.yaw = (int)(Math.atan2(this.field956, this.field957) * 325.949D) + 1024 & 2047; // L: 88
		this.pitch = (int)(Math.atan2(this.speedZ, this.field944) * 325.949D) & 2047; // L: 89
		if (this.sequenceDefinition != null) { // L: 90
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 91
				this.frameCycle += var1; // L: 92

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 93
								return; // L: 110
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 94
							++this.frame; // L: 95
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 96

						this.frame -= this.sequenceDefinition.frameCount; // L: 97
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 98

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 103
				int var2 = this.sequenceDefinition.method4064(); // L: 104
				if (this.frame >= var2) { // L: 105
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 106
				}
			}
		}

	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1070521773"
	)
	static boolean method2209() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5188
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2039275921"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class396.method7403(); // L: 12347
		class159.method3426(); // L: 12348
		int var1 = FloorOverlayDefinition.VarpDefinition_get(var0).type; // L: 12349
		if (var1 != 0) { // L: 12350
			int var2 = Varps.Varps_main[var0]; // L: 12351
			if (var1 == 1) { // L: 12352
				if (var2 == 1) { // L: 12353
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 12354
					((TextureProvider)Rasterizer3D.field2772.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 12355
					class166.method3495(); // L: 12356
					WorldMapIcon_1.clientPreferences.method2551(0.9D); // L: 12357
				}

				if (var2 == 2) { // L: 12359
					Rasterizer3D.Rasterizer3D_setBrightness(0.8D); // L: 12360
					((TextureProvider)Rasterizer3D.field2772.Rasterizer3D_textureLoader).setBrightness(0.8D); // L: 12361
					class166.method3495(); // L: 12362
					WorldMapIcon_1.clientPreferences.method2551(0.8D); // L: 12363
				}

				if (var2 == 3) { // L: 12365
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 12366
					((TextureProvider)Rasterizer3D.field2772.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 12367
					class166.method3495(); // L: 12368
					WorldMapIcon_1.clientPreferences.method2551(0.7D); // L: 12369
				}

				if (var2 == 4) { // L: 12371
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 12372
					((TextureProvider)Rasterizer3D.field2772.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 12373
					class166.method3495(); // L: 12374
					WorldMapIcon_1.clientPreferences.method2551(0.6D); // L: 12375
				}
			}

			if (var1 == 3) { // L: 12378
				if (var2 == 0) { // L: 12379
					Decimator.method1153(255);
				}

				if (var2 == 1) { // L: 12380
					Decimator.method1153(192);
				}

				if (var2 == 2) { // L: 12381
					Decimator.method1153(128);
				}

				if (var2 == 3) { // L: 12382
					Decimator.method1153(64);
				}

				if (var2 == 4) { // L: 12383
					Decimator.method1153(0);
				}
			}

			if (var1 == 4) { // L: 12385
				if (var2 == 0) { // L: 12386
					SoundSystem.method868(127);
				}

				if (var2 == 1) { // L: 12387
					SoundSystem.method868(96);
				}

				if (var2 == 2) { // L: 12388
					SoundSystem.method868(64);
				}

				if (var2 == 3) { // L: 12389
					SoundSystem.method868(32);
				}

				if (var2 == 4) { // L: 12390
					SoundSystem.method868(0);
				}
			}

			if (var1 == 5) { // L: 12392
				Client.field632 = var2 == 1;
			}

			if (var1 == 6) { // L: 12393
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 12394
			}

			if (var1 == 10) { // L: 12395
				if (var2 == 0) { // L: 12396
					Login.method2198(127);
				}

				if (var2 == 1) { // L: 12397
					Login.method2198(96);
				}

				if (var2 == 2) { // L: 12398
					Login.method2198(64);
				}

				if (var2 == 3) { // L: 12399
					Login.method2198(32);
				}

				if (var2 == 4) { // L: 12400
					Login.method2198(0);
				}
			}

			if (var1 == 17) { // L: 12402
				Client.followerIndex = var2 & 65535; // L: 12403
			}

			if (var1 == 18) { // L: 12405
				Client.playerAttackOption = (AttackOption)class12.findEnumerated(MenuAction.method2139(), var2); // L: 12406
				if (Client.playerAttackOption == null) { // L: 12407
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12409
				if (var2 == -1) { // L: 12410
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12411
				}
			}

			if (var1 == 22) { // L: 12413
				AttackOption[] var3 = new AttackOption[]{AttackOption.field1334, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1337}; // L: 12416
				Client.npcAttackOption = (AttackOption)class12.findEnumerated(var3, var2); // L: 12418
				if (Client.npcAttackOption == null) { // L: 12419
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12421
}
