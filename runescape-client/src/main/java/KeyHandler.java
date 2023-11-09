import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -55139539
	)
	static int field172;
	@ObfuscatedName("cy")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1655404347
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 92
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "79"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class1.World_request == null) { // L: 31
				class1.World_request = TaskHandler.urlRequester.request(new URL(class9.field41));
			} else if (class1.World_request.isDone()) { // L: 33
				byte[] var0 = class1.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class420.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				class1.World_request = null;
				return true;
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace();
			class1.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lly;IIIZB)V",
		garbageValue = "1"
	)
	public static void method426(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class286.musicPlayerStatus = 1; // L: 34
		class304.musicTrackArchive = var0; // L: 35
		class109.musicTrackGroupId = var1; // L: 36
		class286.musicTrackFileId = var2; // L: 37
		class467.musicTrackVolume = var3; // L: 38
		class145.musicTrackBoolean = var4; // L: 39
		class286.pcmSampleLength = 10000;
	} // L: 41

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbm;",
		garbageValue = "3"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 45
		Script var5;
		if (var6 != null) { // L: 46
			var5 = var6; // L: 47
		} else {
			String var7 = String.valueOf(var3); // L: 50
			int var8 = class71.archive12.getGroupId(var7); // L: 51
			if (var8 == -1) { // L: 52
				var5 = null; // L: 53
			} else {
				label59: {
					byte[] var9 = class71.archive12.takeFileFlat(var8); // L: 56
					if (var9 != null) { // L: 57
						if (var9.length <= 1) { // L: 58
							var5 = null; // L: 59
							break label59; // L: 60
						}

						var6 = FriendSystem.newScript(var9); // L: 62
						if (var6 != null) { // L: 63
							Script.Script_cached.put(var6, (long)(var3 << 16)); // L: 64
							var5 = var6; // L: 65
							break label59; // L: 66
						}
					}

					var5 = null; // L: 69
				}
			}
		}

		if (var5 != null) { // L: 72
			return var5; // L: 73
		} else {
			int var13 = (-3 - var2 << 8) + var0; // L: 77
			Script var15 = (Script)Script.Script_cached.get((long)(var13 << 16)); // L: 82
			Script var14;
			if (var15 != null) { // L: 83
				var14 = var15; // L: 84
			} else {
				String var10 = String.valueOf(var13); // L: 87
				int var11 = class71.archive12.getGroupId(var10); // L: 88
				if (var11 == -1) { // L: 89
					var14 = null; // L: 90
				} else {
					byte[] var12 = class71.archive12.takeFileFlat(var11); // L: 93
					if (var12 != null) { // L: 94
						if (var12.length <= 1) { // L: 95
							var14 = null; // L: 96
							return var14 != null ? var14 : null; // L: 109 112
						}

						var15 = FriendSystem.newScript(var12); // L: 99
						if (var15 != null) { // L: 100
							Script.Script_cached.put(var15, (long)(var13 << 16)); // L: 101
							var14 = var15; // L: 102
							return var14 != null ? var14 : null;
						}
					}

					var14 = null; // L: 106
				}
			}

			return var14 != null ? var14 : null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1517575560"
	)
	protected static final void method430() {
		UrlRequest.clock.mark(); // L: 460

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 461
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 462
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class173.gameCyclesToDo = 0; // L: 463
	} // L: 464

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method429() {
		if (BufferedSink.field4572) { // L: 3531
			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3533
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3534
				var1.method2294(); // L: 3535
			}

			BufferedSink.field4572 = false; // L: 3538
		}

	} // L: 3540
}
