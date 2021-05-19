import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class35 {
	@ObfuscatedName("f")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 327341305
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("h")
	ExecutorService field246;
	@ObfuscatedName("c")
	Future field247;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	final Buffer field244;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class31 field245;

	@ObfuscatedSignature(
		descriptor = "(Lnk;Lat;)V"
	)
	public class35(Buffer var1, class31 var2) {
		this.field246 = Executors.newSingleThreadExecutor();
		this.field244 = var1;
		this.field245 = var2;
		this.method399();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method409() {
		return this.field247.isDone();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "20171"
	)
	public void method397() {
		this.field246.shutdown();
		this.field246 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnk;",
		garbageValue = "-342395493"
	)
	public Buffer method408() {
		try {
			return (Buffer)this.field247.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1826424495"
	)
	void method399() {
		this.field247 = this.field246.submit(new class29(this, this.field244, this.field245));
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnm;II)V",
		garbageValue = "415858019"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1186 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (Messages.baseY * 64 + var4.pathY[0] >> 13) + (JagexCache.baseX * 64 + var4.pathX[0] >> 13 << 14);
				if (var4.field1247 != -1) {
					Players.Players_orientations[var1] = var4.field1247;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					Tiles.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1186 = false;
				} else if (var2) {
					var4.field1186 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1186 = false;
					var4.method2140(var6, var7, Players.field1345[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
					if (var2) {
						var4.field1186 = true;
						var4.tileX = var6;
						var4.tileY = var7;
					} else {
						var4.field1186 = false;
						var4.method2140(var6, var7, Players.field1345[var1]);
					}
				} else {
					var4.resetPath(var6, var7);
					var4.field1186 = false;
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1186 = false;
					} else if (var2) {
						var4.field1186 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1186 = false;
						var4.method2140(var10, var11, Players.field1345[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						ParamComposition.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (JagexCache.baseX * 64 + var8 + var4.pathX[0] & 16383) - JagexCache.baseX * 64;
					var11 = (Messages.baseY * 64 + var9 + var4.pathY[0] & 16383) - Messages.baseY * 64;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1186 = false;
					} else if (var2) {
						var4.field1186 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1186 = false;
						var4.method2140(var10, var11, Players.field1345[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						ParamComposition.Client_plane = var4.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IS)V",
		garbageValue = "14935"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1254 >= Client.cycle) {
			var2 = Math.max(1, var0.field1254 - Client.cycle);
			var3 = var0.field1236 * 128 + var0.field1211 * 64;
			var4 = var0.field1252 * 128 + var0.field1211 * 64;
			var0.x += (var3 - var0.x) / var2;
			var0.y += (var4 - var0.y) / var2;
			var0.field1250 = 0;
			var0.orientation = var0.field1256;
		} else if (var0.field1237 >= Client.cycle) {
			if (var0.field1237 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > Player.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
				var2 = var0.field1237 - var0.field1254;
				var3 = Client.cycle - var0.field1254;
				var4 = var0.field1236 * 128 + var0.field1211 * 64;
				int var5 = var0.field1252 * 128 + var0.field1211 * 64;
				int var6 = var0.field1251 * 128 + var0.field1211 * 64;
				int var7 = var0.field1253 * 128 + var0.field1211 * 64;
				var0.x = (var3 * var6 + var4 * (var2 - var3)) / var2;
				var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2;
			}

			var0.field1250 = 0;
			var0.orientation = var0.field1256;
			var0.rotation = var0.orientation;
		} else {
			class369.method6314(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1254 = 0;
			var0.field1237 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1211 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1211 * 64;
			var0.method2194();
		}

		if (localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1254 = 0;
			var0.field1237 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1211 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1211 * 64;
			var0.method2194();
		}

		class7.method87(var0);
		class6.method71(var0);
	}
}
