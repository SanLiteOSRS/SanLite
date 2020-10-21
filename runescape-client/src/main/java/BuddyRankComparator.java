import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkl;Lkl;I)I",
		garbageValue = "-776394962"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1048639306"
	)
	static int method3558(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-878017920"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "18"
	)
	static int method3557(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1535987208"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				ByteArrayPool.client.method1112();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field947 = 0;
				Client.field715 = 0;
				Client.timer.method5153(var0);
				if (var0 != 20) {
					Message.method1314(false);
				}
			}

			if (var0 != 20 && var0 != 40 && MouseRecorder.field615 != null) {
				MouseRecorder.field615.close();
				MouseRecorder.field615 = null;
			}

			if (Client.gameState == 25) {
				Client.field722 = 0;
				Client.field734 = 0;
				Client.field735 = 1;
				Client.field848 = 0;
				Client.field737 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					HealthBar.method2141(class281.archive10, GrandExchangeOffer.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					HealthBar.method2141(class281.archive10, GrandExchangeOffer.archive8, false, 4);
				} else if (Login.clearLoginScreen) {
					Tiles.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					class278.runesSprite = null;
					Login.leftTitleSprite = null;
					Login.rightTitleSprite = null;
					SecureRandomFuture.logoSprite = null;
					DefaultsGroup.title_muteSprite = null;
					Login.options_buttons_0Sprite = null;
					Login.options_buttons_2Sprite = null;
					EnumComposition.worldSelectBackSprites = null;
					FaceNormal.worldSelectFlagSprites = null;
					class301.worldSelectArrows = null;
					GameObject.worldSelectStars = null;
					MouseHandler.field523 = null;
					Login.loginScreenRunesAnimation.method1917();
					VertexNormal.method3133(2);
					WorldMapSection0.method323(true);
					Login.clearLoginScreen = false;
				}
			} else {
				HealthBar.method2141(class281.archive10, GrandExchangeOffer.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}
}
