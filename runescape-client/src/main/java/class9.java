import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class9 {
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		signature = "Ldf;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("z")
	ExecutorService field52;
	@ObfuscatedName("k")
	Future field48;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	final Buffer field49;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lh;"
	)
	final class12 field50;

	@ObfuscatedSignature(
		signature = "(Lkf;Lh;)V"
	)
	public class9(Buffer var1, class12 var2) {
		this.field52 = Executors.newSingleThreadExecutor();
		this.field49 = var1;
		this.field50 = var2;
		this.method118();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "16"
	)
	public boolean method109() {
		return this.field48.isDone();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1920645781"
	)
	public void method110() {
		this.field52.shutdown();
		this.field52 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)Lkf;",
		garbageValue = "-1217218558"
	)
	public Buffer method122() {
		try {
			return (Buffer)this.field48.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "113"
	)
	void method118() {
		this.field48 = this.field52.submit(new class8(this, this.field49, this.field50));
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "653540515"
	)
	static final int method111() {
		if (Tile.clientPreferences.roofsHidden) {
			return Huffman.Client_plane;
		} else {
			int var0 = 3;
			if (PacketBuffer.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) {
					var1 = GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7;
					var2 = MouseHandler.oculusOrbFocalPointY >> 7;
				} else {
					var1 = WorldMapLabelSize.localPlayer.x >> 7;
					var2 = WorldMapLabelSize.localPlayer.y >> 7;
				}

				int var3 = VertexNormal.cameraX >> 7;
				int var4 = AbstractWorldMapData.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return Huffman.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return Huffman.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) {
					var0 = Huffman.Client_plane;
				}

				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;

					while (var3 != var1) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) {
							var0 = Huffman.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) {
								var0 = Huffman.Client_plane;
							}
						}
					}
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;

					while (var4 != var2) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) {
							var0 = Huffman.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) {
								var0 = Huffman.Client_plane;
							}
						}
					}
				}
			}

			if (WorldMapLabelSize.localPlayer.x >= 0 && WorldMapLabelSize.localPlayer.y >= 0 && WorldMapLabelSize.localPlayer.x < 13312 && WorldMapLabelSize.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][WorldMapLabelSize.localPlayer.x >> 7][WorldMapLabelSize.localPlayer.y >> 7] & 4) != 0) {
					var0 = Huffman.Client_plane;
				}

				return var0;
			} else {
				return Huffman.Client_plane;
			}
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		signature = "(IIIIIIIIII)V",
		garbageValue = "-1834411387"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			WorldMapIcon_1.method375(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field964 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}
