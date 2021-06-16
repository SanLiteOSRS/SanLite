import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lie;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lib;[IIIIB)V",
		garbageValue = "0"
	)
	void method4761(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2851[var1.field2898] & 4) != 0 && var1.field2903 < 0) {
			int var6 = this.superStream.field2856[var1.field2898] / class341.field3921;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2899) / var6;
				if (var7 > var4) {
					var1.field2899 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2899 += var7 * var6 - 1048576;
				int var8 = class341.field3921 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2854[var1.field2898] == 0) {
					var1.stream = RawPcmStream.method937(var1.rawSound, var10.method957(), var10.method948(), var10.method949());
				} else {
					var1.stream = RawPcmStream.method937(var1.rawSound, var10.method957(), 0, var10.method949());
					this.superStream.method4567(var1, var1.patch.field2882[var1.field2910] < 0);
					var1.stream.method953(var8, var10.method948());
				}

				if (var1.patch.field2882[var1.field2910] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method955(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method959()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lib;II)V",
		garbageValue = "-1540806393"
	)
	void method4744(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2851[var1.field2898] & 4) != 0 && var1.field2903 < 0) {
			int var3 = this.superStream.field2856[var1.field2898] / class341.field3921;
			int var4 = (var3 + 1048575 - var1.field2899) / var3;
			var1.field2899 = var3 * var2 + var1.field2899 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2854[var1.field2898] == 0) {
					var1.stream = RawPcmStream.method937(var1.rawSound, var1.stream.method957(), var1.stream.method948(), var1.stream.method949());
				} else {
					var1.stream = RawPcmStream.method937(var1.rawSound, var1.stream.method957(), 0, var1.stream.method949());
					this.superStream.method4567(var1, var1.patch.field2882[var1.field2910] < 0);
				}

				if (var1.patch.field2882[var1.field2910] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2899 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("r")
	protected int vmethod4740() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4589(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2913) {
						this.method4761(var6, var1, var4, var5, var4 + var5);
						var6.field2913 -= var5;
						break;
					}

					this.method4761(var6, var1, var4, var6.field2913, var4 + var5);
					var4 += var6.field2913;
					var5 -= var6.field2913;
				} while(!this.superStream.method4590(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("z")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4589(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2913) {
						this.method4744(var3, var2);
						var3.field2913 -= var2;
						break;
					}

					this.method4744(var3, var3.field2913);
					var2 -= var3.field2913;
				} while(!this.superStream.method4590(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "-8788"
	)
	static String method4743(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1611002250"
	)
	static final void method4762() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == SoundSystem.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					if (var0.targetIndex > 0) {
						NPC var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, ItemContainer.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						int var2 = -var0.targetIndex - 1;
						Player var3;
						if (var2 == Client.localPlayerIndex) {
							var3 = class262.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, ItemContainer.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.field683);
					DevicePcmPlayerProvider.scene.drawEntity(SoundSystem.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}
}
