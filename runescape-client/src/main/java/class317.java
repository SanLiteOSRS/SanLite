import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class317 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public AbstractArchive field3514;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1168215327
	)
	public int field3511;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -109873503
	)
	public int field3512;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 982072253
	)
	public int field3513;
	@ObfuscatedName("ac")
	public float field3510;
	@ObfuscatedName("ai")
	public boolean field3515;
	@ObfuscatedName("az")
	public boolean field3516;
	@ObfuscatedName("ap")
	public boolean field3518;
	@ObfuscatedName("aa")
	public boolean field3524;
	@ObfuscatedName("af")
	public boolean field3519;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	public MidiPcmStream field3517;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	public SoundCache field3521;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public MusicTrack field3522;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class317(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3511 = -1;
		this.field3512 = -1;
		this.field3513 = 0;
		this.field3510 = 0.0F;
		this.field3515 = false;
		this.field3524 = false;
		this.field3519 = false;
		this.field3511 = var1.getGroupId(var2); // L: 22
		this.field3512 = var1.getFileId(this.field3511, var3); // L: 23
		this.method6016(var1, this.field3511, this.field3512, var4, var5); // L: 24
	} // L: 25

	@ObfuscatedSignature(
		descriptor = "(Lnu;IIIZ)V"
	)
	public class317(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3511 = -1; // L: 8
		this.field3512 = -1; // L: 9
		this.field3513 = 0; // L: 10
		this.field3510 = 0.0F; // L: 11
		this.field3515 = false; // L: 12
		this.field3524 = false; // L: 15
		this.field3519 = false; // L: 16
		this.method6016(var1, var2, var3, var4, var5); // L: 28
	} // L: 29

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IIIZB)V",
		garbageValue = "28"
	)
	void method6016(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3514 = var1; // L: 32
		this.field3511 = var2; // L: 33
		this.field3512 = var3; // L: 34
		this.field3513 = var4; // L: 35
		this.field3515 = var5; // L: 36
	} // L: 37

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-79"
	)
	static void method6014(int var0) {
		if (var0 != Client.gameState) { // L: 1309
			if (Client.gameState == 30) { // L: 1310
				Client.field765.method4092(); // L: 1311
			}

			if (Client.gameState == 0) { // L: 1313
				class219.client.method658();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1314
				class316.method6012(0); // L: 1315
				Client.field541 = 0; // L: 1316
				Client.field592 = 0; // L: 1317
				Client.timer.method7685(var0); // L: 1318
				if (var0 != 20) { // L: 1319
					PendingSpawn.method2368(false);
				}
			}

			if (var0 != 20 && var0 != 40 && AbstractSocket.field4675 != null) { // L: 1321 1322
				AbstractSocket.field4675.close(); // L: 1323
				AbstractSocket.field4675 = null; // L: 1324
			}

			if (Client.gameState == 25) { // L: 1327
				Client.field600 = 0; // L: 1328
				Client.field596 = 0; // L: 1329
				Client.field630 = 1; // L: 1330
				Client.field598 = 0; // L: 1331
				Client.field599 = 1; // L: 1332
			}

			if (var0 != 5 && var0 != 10) { // L: 1334
				if (var0 == 20) { // L: 1342
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1343
					Timer.method7688(class141.field1665, PcmPlayer.field304, false, var3); // L: 1344
				} else if (var0 == 11) { // L: 1346
					Timer.method7688(class141.field1665, PcmPlayer.field304, false, 4); // L: 1347
				} else if (var0 == 50) { // L: 1349
					class318.setLoginResponseString("", "Updating date of birth...", ""); // L: 1350
					Timer.method7688(class141.field1665, PcmPlayer.field304, false, 7); // L: 1351
				} else if (class403.clearLoginScreen) { // L: 1354
					Login.titleboxSprite = null; // L: 1355
					class219.field2417 = null; // L: 1356
					Login.field931 = null; // L: 1357
					Login.leftTitleSprite = null; // L: 1358
					Bounds.rightTitleSprite = null; // L: 1359
					SoundSystem.logoSprite = null; // L: 1360
					class13.title_muteSprite = null; // L: 1361
					Login.field929 = null; // L: 1362
					UserComparator6.field1491 = null; // L: 1363
					class74.worldSelectBackSprites = null; // L: 1364
					SoundCache.worldSelectFlagSprites = null; // L: 1365
					MusicPatchPcmStream.worldSelectArrows = null; // L: 1366
					SecureRandomCallable.worldSelectStars = null; // L: 1367
					VarcInt.field1966 = null; // L: 1368
					class139.loginScreenRunesAnimation.method2415(); // L: 1369
					Script.method2180(0, 100); // L: 1370
					CollisionMap.method4177().method6793(true); // L: 1371
					class403.clearLoginScreen = false; // L: 1372
				}
			} else {
				boolean var1 = class449.clientPreferences.method2468() >= Client.field531; // L: 1337
				int var2 = var1 ? 0 : 12; // L: 1339
				Timer.method7688(class141.field1665, PcmPlayer.field304, true, var2); // L: 1340
			}

			Client.gameState = var0; // L: 1374
		}
	} // L: 1375
}
