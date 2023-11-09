import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class216 {
	@ObfuscatedName("ai")
	final int[][] field2389;
	@ObfuscatedName("aj")
	final int[][] field2383;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -499482519
	)
	int field2384;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -347560877
	)
	int field2385;
	@ObfuscatedName("ay")
	final int[] field2386;
	@ObfuscatedName("ap")
	final int[] field2387;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -525804657
	)
	final int field2388;

	public class216(int var1, int var2) {
		this.field2389 = new int[var1][var2]; // L: 15
		this.field2383 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = Calendar.method6620(var3 / 4); // L: 18
		this.field2386 = new int[var4]; // L: 19
		this.field2387 = new int[var4]; // L: 20
		this.field2388 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "739624863"
	)
	public void method4352() {
		for (int var1 = 0; var1 < this.field2389.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2389[var1].length; ++var2) { // L: 26
				this.field2389[var1][var2] = 0; // L: 27
				this.field2383[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-836936343"
	)
	public void method4341(int var1, int var2) {
		this.field2384 = var1; // L: 34
		this.field2385 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1575904116"
	)
	public int method4342() {
		return this.field2384; // L: 39
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "108"
	)
	public int method4343() {
		return this.field2385; // L: 43
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1443043972"
	)
	public int method4344() {
		return this.field2389.length; // L: 47
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1128121235"
	)
	public int method4340() {
		return this.field2389[0].length; // L: 51
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "0"
	)
	public int[][] method4339() {
		return this.field2389; // L: 55
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "811682719"
	)
	public int[][] method4347() {
		return this.field2383; // L: 59
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-481575995"
	)
	public int[] method4348() {
		return this.field2386; // L: 63
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1433684713"
	)
	public int[] method4349() {
		return this.field2387; // L: 67
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "275454578"
	)
	public int method4350() {
		return this.field2388; // L: 71
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "103500760"
	)
	static final void method4362() {
		if (class295.FriendsChatManager_inFriendsChat) { // L: 3852
			if (ObjectSound.friendsChatManager != null) { // L: 3853
				ObjectSound.friendsChatManager.sort(); // L: 3854
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3857
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3858
				var1.clearIsInFriendsChat(); // L: 3859
			}

			class295.FriendsChatManager_inFriendsChat = false; // L: 3862
		}

	} // L: 3864

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5742
			int var3 = class291.getTileHeight(var0, var1, BuddyRankComparator.Client_plane) - var2; // L: 5747
			var0 -= PacketWriter.cameraX; // L: 5748
			var3 -= class309.cameraY; // L: 5749
			var1 -= World.cameraZ; // L: 5750
			int var4 = Rasterizer3D.Rasterizer3D_sine[ModeWhere.cameraPitch]; // L: 5751
			int var5 = Rasterizer3D.Rasterizer3D_cosine[ModeWhere.cameraPitch]; // L: 5752
			int var6 = Rasterizer3D.Rasterizer3D_sine[class13.cameraYaw]; // L: 5753
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class13.cameraYaw]; // L: 5754
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5755
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5756
			var0 = var8; // L: 5757
			var8 = var3 * var5 - var4 * var1 >> 16; // L: 5758
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 5759
			if (var1 >= 50) { // L: 5761
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5762
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5763
			} else {
				Client.viewportTempX = -1; // L: 5766
				Client.viewportTempY = -1; // L: 5767
			}

		} else {
			Client.viewportTempX = -1; // L: 5743
			Client.viewportTempY = -1; // L: 5744
		}
	} // L: 5745 5769
}
