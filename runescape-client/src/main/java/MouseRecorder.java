import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("v")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("n")
	@Export("lock")
	Object lock;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1046460859
	)
	@Export("index")
	int index;
	@ObfuscatedName("y")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("p")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("j")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		while (this.isRunning) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}

			long var4 = 49L;

			try {
				Thread.sleep(var4);
			} catch (InterruptedException var7) {
			}

			try {
				Thread.sleep(1L);
			} catch (InterruptedException var6) {
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Lem;",
		garbageValue = "1845003548"
	)
	static VerticalAlignment[] method2095() {
		return new VerticalAlignment[]{VerticalAlignment.field1672, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1670};
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-558099635"
	)
	static final void method2099(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-195720663"
	)
	static String method2098(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "642993573"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		DesktopPlatformInfoProvider.method6068();
		if (WorldMapRegion.clanChat != null) {
			WorldMapRegion.clanChat.invalidateIgnoreds();
		}

	}
}
