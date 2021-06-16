import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class35 {
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field244;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("f")
	ExecutorService field245;
	@ObfuscatedName("e")
	Future field239;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final Buffer field247;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class31 field241;

	@ObfuscatedSignature(
		descriptor = "(Lnt;Laz;)V"
	)
	public class35(Buffer var1, class31 var2) {
		this.field245 = Executors.newSingleThreadExecutor();
		this.field247 = var1;
		this.field241 = var2;
		this.method413();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1008458441"
	)
	public boolean method420() {
		return this.field239.isDone();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	public void method410() {
		this.field245.shutdown();
		this.field245 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lnt;",
		garbageValue = "627853337"
	)
	public Buffer method416() {
		try {
			return (Buffer)this.field239.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2058888310"
	)
	void method413() {
		this.field239 = this.field245.submit(new class29(this, this.field247, this.field241));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2087422044"
	)
	public static void method422() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1578358976"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (ReflectionCheck.method1227(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var10;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lns;II)Z",
		garbageValue = "-685210313"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1362[var1] != null) {
					var11.read(Players.field1362[var1]);
				}

				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1361[var1];
				var11.plane = (byte)var8;
				var11.resetPath((var9 << 13) + var3 - class15.baseX * 64, (var10 << 13) + var4 - WorldMapSprite.baseY * 64);
				var11.field1201 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Z",
		garbageValue = "2109502620"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "163144058"
	)
	static void method421() {
		Client.packetWriter.addNode(InterfaceParent.getPacketBufferNode(ClientPacket.field2599, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}
