import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class14 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 245766513
	)
	final int field63;
	@ObfuscatedName("an")
	final String field59;
	@ObfuscatedName("ar")
	final ThreadFactory field60;
	@ObfuscatedName("ab")
	final ThreadPoolExecutor field58;

	public class14(String var1, int var2, int var3) {
		this.field59 = var1; // L: 15
		this.field63 = var2; // L: 16
		this.field60 = new class16(this); // L: 17
		this.field58 = this.method169(var3); // L: 18
	} // L: 19

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "16777215"
	)
	final ThreadPoolExecutor method169(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field63), this.field60); // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lad;I)Laf;",
		garbageValue = "777978638"
	)
	public class18 method170(class10 var1) {
		if (this.field58.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field58.getCorePoolSize() + " Queue capacity " + this.field63); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field58.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	public final void method173() {
		try {
			this.field58.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "98926123"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2118
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2119
			boolean var1 = var0.isMembersOnly(); // L: 2120
			if (var1 != class148.ItemComposition_inMembersWorld) { // L: 2122
				class143.method3110(); // L: 2123
				class148.ItemComposition_inMembersWorld = var1; // L: 2124
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 2128
			class211.method4117(GameBuild.archive8, var0.properties); // L: 2129
		}

		WorldMapData_1.worldHost = var0.host; // L: 2131
		Client.worldId = var0.id; // L: 2132
		Client.worldProperties = var0.properties; // L: 2133
		WorldMapArea.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2134
		ChatChannel.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2135
		class92.currentPort = WorldMapArea.worldPort; // L: 2136
	} // L: 2137

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	static void method179() {
		Login.worldSelectOpen = false; // L: 2145
		class305.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2146
		class362.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2147
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 2148
	} // L: 2149

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-42232886"
	)
	static void method171(int var0) {
		if (var0 != Login.loginIndex) { // L: 2157
			Login.loginIndex = var0; // L: 2158
		}
	} // L: 2159

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmz;ZI)V",
		garbageValue = "-683345128"
	)
	public static void method168(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1052
		var0.field3666 = new PlayerComposition(var1); // L: 1053
		if (!var2) { // L: 1054
			var0.field3666.equipment = Arrays.copyOf(var0.field3666.field3547, var0.field3666.field3547.length); // L: 1055
			var0.field3666.method6140(); // L: 1056
		}

	} // L: 1058

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1847155740"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[NetFileRequest.Client_plane][var0][var1]; // L: 8385
		if (var2 == null) { // L: 8386
			UserComparator4.scene.removeGroundItemPile(NetFileRequest.Client_plane, var0, var1); // L: 8387
		} else {
			long var3 = -99999999L; // L: 8390
			TileItem var5 = null; // L: 8391

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8392 8393 8403
				ItemComposition var7 = class230.ItemComposition_get(var6.id); // L: 8394
				long var11 = (long)var7.price; // L: 8395
				if (var7.isStackable == 1) { // L: 8396
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8397
				}

				if (var11 > var3) { // L: 8399
					var3 = var11; // L: 8400
					var5 = var6; // L: 8401
				}
			}

			if (var5 == null) { // L: 8405
				UserComparator4.scene.removeGroundItemPile(NetFileRequest.Client_plane, var0, var1); // L: 8406
			} else {
				var2.addLast(var5); // L: 8409
				TileItem var13 = null; // L: 8410
				TileItem var8 = null; // L: 8411

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8412 8413 8418
					if (var6.id != var5.id) { // L: 8414
						if (var13 == null) { // L: 8415
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 8416
							var8 = var6;
						}
					}
				}

				long var9 = ArchiveLoader.calculateTag(var0, var1, 3, false, 0); // L: 8420
				UserComparator4.scene.newGroundItemPile(NetFileRequest.Client_plane, var0, var1, class208.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, NetFileRequest.Client_plane), var5, var9, var13, var8); // L: 8421
			}
		}
	} // L: 8388 8407 8422
}
