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

@ObfuscatedName("to")
@Implements("AccessFile")
public final class AccessFile {
	@ObfuscatedName("at")
	@Export("file")
	RandomAccessFile file;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -5580478468447993759L
	)
	@Export("maxSize")
	final long maxSize;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 1665217932623654273L
	)
	@Export("offset")
	long offset;

	public AccessFile(File var1, String var2, long var3) throws IOException {
		if (-1L == var3) { // L: 11
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) { // L: 12
			var1.delete(); // L: 13
		}

		this.file = new RandomAccessFile(var1, var2); // L: 15
		this.maxSize = var3; // L: 16
		this.offset = 0L; // L: 17
		int var5 = this.file.read(); // L: 18
		if (var5 != -1 && !var2.equals("r")) { // L: 19
			this.file.seek(0L); // L: 20
			this.file.write(var5); // L: 21
		}

		this.file.seek(0L); // L: 23
	} // L: 24

	@ObfuscatedName("at")
	@Export("seek")
	final void seek(long var1) throws IOException {
		this.file.seek(var1); // L: 27
		this.offset = var1; // L: 28
	} // L: 29

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "382643150"
	)
	@Export("write")
	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.offset > this.maxSize) { // L: 32
			this.file.seek(this.maxSize); // L: 33
			this.file.write(1); // L: 34
			throw new EOFException(); // L: 35
		} else {
			this.file.write(var1, var2, var3); // L: 37
			this.offset += (long)var3; // L: 38
		}
	} // L: 39

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	@Export("close")
	public final void close() throws IOException {
		this.closeSync(false); // L: 42
	} // L: 43

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "52"
	)
	@Export("closeSync")
	public final void closeSync(boolean var1) throws IOException {
		if (this.file != null) { // L: 46
			if (var1) { // L: 47
				try {
					this.file.getFD().sync(); // L: 49
				} catch (SyncFailedException var3) { // L: 51
				}
			}

			this.file.close(); // L: 53
			this.file = null; // L: 54
		}

	} // L: 56

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "494268668"
	)
	@Export("length")
	public final long length() throws IOException {
		return this.file.length(); // L: 59
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1827594375"
	)
	@Export("read")
	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.file.read(var1, var2, var3); // L: 63
		if (var4 > 0) {
			this.offset += (long)var4; // L: 64
		}

		return var4; // L: 65
	}

	protected void finalize() throws Throwable {
		if (this.file != null) { // L: 69
			System.out.println(""); // L: 70
			this.close(); // L: 71
		}

	} // L: 73

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lds;ZB)V",
		garbageValue = "-57"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5019
			var0.isUnanimated = false; // L: 5020
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5021 5022
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5024
			int var3 = var0.y >> 7; // L: 5025
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5026
				long var4 = Player.calculateTag(0, 0, 0, false, var0.index); // L: 5027
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5028
					var0.isUnanimated = false; // L: 5029
					var0.tileHeight = WorldMapDecorationType.getTileHeight(var0.x, var0.y, ItemLayer.Client_plane); // L: 5030
					var0.playerCycle = Client.cycle; // L: 5031
					class36.scene.addNullableObject(ItemLayer.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5032
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5035
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5036
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5037
					}

					var0.tileHeight = WorldMapDecorationType.getTileHeight(var0.x, var0.y, ItemLayer.Client_plane); // L: 5039
					var0.playerCycle = Client.cycle; // L: 5040
					class36.scene.drawEntity(ItemLayer.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5041
				}
			}
		}

	} // L: 5045
}
