import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("c")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1831338455
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1613676277
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1947205632
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2018508800
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 2791850332732375269L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lej;"
	)
	@Export("entity")
	public Renderable entity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1457303601
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)[Llb;",
		garbageValue = "1849672417"
	)
	static PrivateChatMode[] method2989() {
		return new PrivateChatMode[]{PrivateChatMode.field3826, PrivateChatMode.field3824, PrivateChatMode.field3827};
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Liw;III)Llc;",
		garbageValue = "1333431169"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class217.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : class281.method5132();
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1780593024"
	)
	static final void method2986() {
		if (Client.logoutTimer > 0) {
			class89.logOut();
		} else {
			Client.timer.method5147();
			BuddyRankComparator.updateGameState(40);
			MouseRecorder.field615 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-584173376"
	)
	static final void method2988() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) {
				if (var0.objectId < 0 || UrlRequest.method3437(var0.objectId, var0.field959)) {
					WorldMapIcon_0.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field963, var0.field959);
					var0.remove();
				}
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.id < 0 || UrlRequest.method3437(var0.id, var0.field962))) {
					WorldMapIcon_0.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field962);
					var0.delay = -1;
					if (var0.objectId == var0.id && var0.objectId == -1) {
						var0.remove();
					} else if (var0.id == var0.objectId && var0.field963 == var0.orientation && var0.field962 == var0.field959) {
						var0.remove();
					}
				}
			}
		}

	}
}
