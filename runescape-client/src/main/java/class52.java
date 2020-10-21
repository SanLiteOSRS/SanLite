import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public final class class52 {
	@ObfuscatedName("a")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("av")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		signature = "Les;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("gw")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "([BIII)Ljava/lang/String;",
		garbageValue = "-1899471565"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class298.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "793107384"
	)
	static boolean method897() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1432177323"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class9.method132();
		if (DevicePcmPlayerProvider.clanChat != null) {
			DevicePcmPlayerProvider.clanChat.invalidateIgnoreds();
		}

	}
}
