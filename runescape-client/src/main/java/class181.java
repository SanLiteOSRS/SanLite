import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class181 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljh;",
		garbageValue = "53"
	)
	public static GameBuild method3592(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.RC, GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.LIVE};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-491948635"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (class25.clanChat != null) {
			class25.clanChat.invalidateIgnoreds();
		}

	}
}
