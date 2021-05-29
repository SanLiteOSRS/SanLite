import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class169 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 398172859
	)
	int field2018;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -829119157
	)
	int field2011;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2102107219
	)
	int field2012;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -620257867
	)
	int field2016;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1859823215
	)
	int field2014;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -466083281
	)
	int field2015;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -558728135
	)
	int field2010;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -77605471
	)
	int field2017;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 832342515
	)
	int field2013;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -701591619
	)
	int field2019;

	class169() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V",
		garbageValue = "1120913212"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2014) {
			var1.regionLowX = this.field2014;
		}

		if (var1.regionHighX < this.field2014) {
			var1.regionHighX = this.field2014;
		}

		if (var1.regionLowY > this.field2015) {
			var1.regionLowY = this.field2015;
		}

		if (var1.regionHighY < this.field2015) {
			var1.regionHighY = this.field2015;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "264048682"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2018 && var1 < this.field2018 + this.field2011) {
			return var2 >= (this.field2012 << 6) + (this.field2010 << 3) && var2 <= (this.field2012 << 6) + (this.field2010 << 3) + 7 && var3 >= (this.field2016 << 6) + (this.field2017 << 3) && var3 <= (this.field2016 << 6) + (this.field2017 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-11"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2014 << 6) + (this.field2013 << 3) && var1 <= (this.field2014 << 6) + (this.field2013 << 3) + 7 && var2 >= (this.field2015 << 6) + (this.field2019 << 3) && var2 <= (this.field2015 << 6) + (this.field2019 << 3) + 7;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1943891890"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2014 * 64 - this.field2012 * 64 + var2 + (this.field2013 * 8 - this.field2010 * 8), var3 + (this.field2015 * 64 - this.field2016 * 64) + (this.field2019 * 8 - this.field2017 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lii;",
		garbageValue = "691158162"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2012 * 64 - this.field2014 * 64 + (this.field2010 * 8 - this.field2013 * 8) + var1;
			int var4 = this.field2016 * 64 - this.field2015 * 64 + var2 + (this.field2017 * 8 - this.field2019 * 8);
			return new Coord(this.field2018, var3, var4);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1138667895"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2018 = var1.readUnsignedByte();
		this.field2011 = var1.readUnsignedByte();
		this.field2012 = var1.readUnsignedShort();
		this.field2010 = var1.readUnsignedByte();
		this.field2016 = var1.readUnsignedShort();
		this.field2017 = var1.readUnsignedByte();
		this.field2014 = var1.readUnsignedShort();
		this.field2013 = var1.readUnsignedByte();
		this.field2015 = var1.readUnsignedShort();
		this.field2019 = var1.readUnsignedByte();
		this.method3529();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-186236256"
	)
	void method3529() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-309944500"
	)
	static void method3549(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field956 * 16384) {
					var5 += var1 - var4.field956 * 16384;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.field957 * 16384) {
					var5 += var2 - var4.field957 * 16384;
				} else if (var2 < var4.y * 16384) {
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field958 && ObjectComposition.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field958 - var5) * ObjectComposition.clientPreferences.areaSoundEffectsVolume / var4.field958;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(class32.field242, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(TileItem.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								class308.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method845(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field954 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(class32.field242, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(TileItem.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								class308.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field954 = var4.field961 + (int)(Math.random() * (double)(var4.field964 - var4.field961));
							}
						}
					} else {
						var4.stream2.method845(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						class308.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						class308.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}
}
