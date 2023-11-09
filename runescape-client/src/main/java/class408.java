import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class408 extends class406 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	AbstractArchive field4527;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	AbstractArchive field4528;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	AbstractArchive field4530;

	@ObfuscatedSignature(
		descriptor = "(Lpm;Lnu;Lnu;Lnu;)V"
	)
	public class408(class406 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 16
		this.field4527 = var2; // L: 17
		this.field4528 = var3; // L: 18
		this.field4530 = var4; // L: 19
		super.field4523 = "LoadSongTask"; // L: 20
	} // L: 21

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		int var1 = 0; // L: 25
		Iterator var2 = class305.field3404.iterator(); // L: 26

		while (true) {
			while (var2.hasNext()) {
				class317 var3 = (class317)var2.next(); // L: 27
				if (var3 != null && var3.field3517.field3443 > 1 && var3.field3517.method5788()) { // L: 29
					this.method7601("Attempted to load patches of already loading midiplayer!"); // L: 30
					return true; // L: 31
				}

				if (var3 != null && !var3.field3516) { // L: 33
					try {
						if (var3.field3514 != null && var3.field3511 != -1 && var3.field3512 != -1) { // L: 38
							if (var3.field3522 == null) { // L: 42
								var3.field3522 = MusicTrack.readTrack(var3.field3514, var3.field3511, var3.field3512); // L: 43
								if (var3.field3522 == null) { // L: 44
									continue;
								}
							}

							if (var3.field3521 == null) { // L: 48
								var3.field3521 = new SoundCache(this.field4530, this.field4528); // L: 49
							}

							if (var3.field3517.method5781(var3.field3522, this.field4527, var3.field3521)) { // L: 51
								++var1; // L: 52
								var3.field3516 = true; // L: 53
								var3.field3517.method5782(); // L: 54
							}
						} else {
							++var1; // L: 39
						}
					} catch (Exception var5) { // L: 57
						Messages.RunException_sendStackTrace((String)null, var5); // L: 58
						this.method7601(var5.getMessage()); // L: 59
						return true; // L: 60
					}
				} else {
					++var1; // L: 34
				}
			}

			if (var1 == class305.field3404.size()) { // L: 64
				return true; // L: 65
			}

			return false; // L: 67
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(IIIILui;Lme;I)V",
		garbageValue = "-1567258086"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12552
		if (var6 > 4225 && var6 < 90000) { // L: 12553
			int var7 = Client.camAngleY & 2047; // L: 12554
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12555
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12556
			int var10 = var3 * var8 + var9 * var2 >> 16; // L: 12557
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12558
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12559
			int var14 = var5.width / 2 - 25; // L: 12560
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12561
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12562
			byte var17 = 20; // L: 12563
			class167.redHintArrowSprite.method9488(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12564
		} else {
			class210.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12566
		}

	} // L: 12567
}
