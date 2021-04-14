import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("AccessFile")
public final class AccessFile {
	@ObfuscatedName("f")
	@Export("file")
	RandomAccessFile file;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 4897243031854950465L
	)
	@Export("maxSize")
	final long maxSize;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = 8129143810943449499L
	)
	@Export("offset")
	long offset;

	public AccessFile(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.file = new RandomAccessFile(var1, var2);
		this.maxSize = var3;
		this.offset = 0L;
		int var5 = this.file.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.file.seek(0L);
			this.file.write(var5);
		}

		this.file.seek(0L);
	}

	@ObfuscatedName("f")
	@Export("seek")
	final void seek(long var1) throws IOException {
		this.file.seek(var1);
		this.offset = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "-206730487"
	)
	@Export("write")
	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.offset > this.maxSize) {
			this.file.seek(this.maxSize);
			this.file.write(1);
			throw new EOFException();
		} else {
			this.file.write(var1, var2, var3);
			this.offset += (long)var3;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1330619520"
	)
	@Export("close")
	public final void close() throws IOException {
		this.closeSync(false);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-696399409"
	)
	@Export("closeSync")
	public final void closeSync(boolean var1) throws IOException {
		if (this.file != null) {
			if (var1) {
				try {
					this.file.getFD().sync();
				} catch (SyncFailedException var3) {
				}
			}

			this.file.close();
			this.file = null;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)J",
		garbageValue = "1218940771"
	)
	@Export("length")
	public final long length() throws IOException {
		return this.file.length();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "([BIIB)I",
		garbageValue = "120"
	)
	@Export("read")
	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.file.read(var1, var2, var3);
		if (var4 > 0) {
			this.offset += (long)var4;
		}

		return var4;
	}

	protected void finalize() throws Throwable {
		if (this.file != null) {
			System.out.println("");
			this.close();
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnk;B)V",
		garbageValue = "54"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = Varcs.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - ItemLayer.baseX * 64;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - Tile.baseY * 64;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		class26.Client_plane = var2.plane = var4;
		if (Players.field1352[var1] != null) {
			var2.read(Players.field1352[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1350[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1350[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-696757994"
	)
	static final void method6382() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == class26.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field799);
					if (var0.isFinished) {
						var0.remove();
					} else {
						WorldMapArea.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}
}
