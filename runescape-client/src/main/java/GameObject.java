import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 704202637
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -494879285
	)
	@Export("height")
	int height;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 211210251
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1046564479
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1520193173
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -478459065
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -849496909
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 427250493
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1968764473
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1764486953
	)
	int field2641;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1523827707
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -6523351122347780293L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -269494523
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmp;ZB)V",
		garbageValue = "38"
	)
	public static void method4647(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) {
			try {
				NetCache.NetCache_socket.close();
			} catch (Exception var8) {
			}

			NetCache.NetCache_socket = null;
		}

		NetCache.NetCache_socket = var0;
		Buffer var2;
		if (NetCache.NetCache_socket != null) {
			try {
				var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				NetCache.NetCache_socket.write(var2.array, 0, 4);
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var6) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0;
		class131.NetCache_currentResponse = null;
		class138.NetCache_responseArchiveBuffer = null;
		NetCache.field3707 = 0;

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
			if (var9 == null) {
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
					if (var9 == null) {
						if (NetCache.field3719 != 0) {
							try {
								var2 = new Buffer(4);
								var2.writeByte(4);
								var2.writeByte(NetCache.field3719);
								var2.writeShort(0);
								NetCache.NetCache_socket.write(var2.array, 0, 4);
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var4) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_loadTime = 0;
						class423.field4436 = class111.method2516();
						return;
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9);
					NetCache.NetCache_pendingWrites.put(var9, var9.key);
					++NetCache.NetCache_pendingWritesCount;
					--NetCache.NetCache_pendingResponsesCount;
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key);
			++NetCache.NetCache_pendingPriorityWritesCount;
			--NetCache.NetCache_pendingPriorityResponsesCount;
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIB)V",
		garbageValue = "-109"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class114.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
