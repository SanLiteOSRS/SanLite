import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class412 {
	@ObfuscatedName("am")
	public char field4545;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2146708003
	)
	public int field4544;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1375073155
	)
	public int field4546;

	class412() {
		this.field4544 = 0; // L: 5
		this.field4546 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1372610125"
	)
	public static int method7750(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var1;
		} else if (var2 == 1) { // L: 11
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0; // L: 12
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Low;Ljava/lang/String;Ljava/lang/String;I)[Lut;",
		garbageValue = "1974839893"
	)
	public static IndexedSprite[] method7748(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 85
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 86
			int var4 = var0.getFileId(var3, var2); // L: 87
			return class197.method3853(var0, var3, var4); // L: 88
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	static final void method7749() {
		int var0;
		int var1;
		int var2;
		if (!Client.field760) { // L: 4107
			var0 = class9.field29 * 16384 + 64; // L: 4108
			var1 = class172.field1817 * 128 + 64; // L: 4109
			var2 = class19.getTileHeight(var0, var1, class113.Client_plane) - HealthBar.field1296; // L: 4110
			GameObject.method5901(var0, var2, var1); // L: 4111
		} else if (Client.field763 != null) { // L: 4113
			GameEngine.cameraX = Client.field763.vmethod8819(); // L: 4114
			GrandExchangeOfferTotalQuantityComparator.cameraZ = Client.field763.vmethod8820(); // L: 4115
			if (Client.field762) { // L: 4116
				KeyHandler.cameraY = Client.field763.vmethod8814(); // L: 4117
			} else {
				KeyHandler.cameraY = class19.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, class113.Client_plane) - Client.field763.vmethod8814(); // L: 4120
			}

			Client.field763.method8831(); // L: 4122
		}

		if (!Client.field761) { // L: 4124
			var0 = SoundSystem.field314 * 128 + 64; // L: 4125
			var1 = ArchiveDiskActionHandler.field4334 * 128 + 64; // L: 4126
			var2 = class19.getTileHeight(var0, var1, class113.Client_plane) - ClanChannel.field1766; // L: 4127
			int var3 = var0 - GameEngine.cameraX; // L: 4128
			int var4 = var2 - KeyHandler.cameraY; // L: 4129
			int var5 = var1 - GrandExchangeOfferTotalQuantityComparator.cameraZ; // L: 4130
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3)); // L: 4131
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 4132
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 4133
			class401.method7504(var7, var8); // L: 4134
		} else {
			if (Client.field765 != null) { // L: 4137
				UserComparator3.cameraPitch = Client.field765.method8812(); // L: 4138
				UserComparator3.cameraPitch = Math.min(Math.max(UserComparator3.cameraPitch, 128), 383); // L: 4139
				Client.field765.method8831(); // L: 4140
			}

			if (Client.field500 != null) { // L: 4142
				HealthBarUpdate.cameraYaw = Client.field500.method8812() & 2047; // L: 4143
				Client.field500.method8831(); // L: 4144
			}
		}

	} // L: 4147
}
