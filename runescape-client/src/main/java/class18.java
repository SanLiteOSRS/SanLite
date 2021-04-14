import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class18 extends class14 {
	@ObfuscatedName("gq")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -1941852289
	)
	static int field145;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1821299355
	)
	int field140;
	@ObfuscatedName("o")
	boolean field141;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class18(class2 var1) {
		this.this$0 = var1;
		this.field140 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field140 = var1.readUnsignedShort();
		this.field141 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method153(this.field140, this.field141);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;I)Z",
		garbageValue = "1246242383"
	)
	public static boolean method280(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			class370.WorldMapElement_count = var0.getGroupFileCount(35);
			GrandExchangeOfferNameComparator.WorldMapElement_cached = new WorldMapElement[class370.WorldMapElement_count];

			for (int var2 = 0; var2 < class370.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				GrandExchangeOfferNameComparator.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].decode(new Buffer(var3));
					GrandExchangeOfferNameComparator.WorldMapElement_cached[var2].method4907();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-608674034"
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-17"
	)
	static void method282() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class9.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = ObjectSound.method1798();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = class19.method297(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class9.setLoginResponseString(Strings.field2961, Strings.field2955, Strings.field3183);
				Login.loginIndex = 6;
				break;
			case 3:
				class9.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class9.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class9.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class9.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class9.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "11"
	)
	static void method283() {
		if (WorldMapAreaData.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}
}
