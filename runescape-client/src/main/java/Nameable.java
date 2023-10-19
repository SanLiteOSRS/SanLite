import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)I",
		garbageValue = "762888653"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lvf;",
		garbageValue = "-16"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-1070"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "725290011"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Lvf;I)V",
		garbageValue = "-184606185"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 26
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 27
			this.previousUsername = var2; // L: 28
		}
	} // L: 29

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1); // L: 36
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)Lkc;",
		garbageValue = "-1515763175"
	)
	static WorldMapSprite method8067(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(Frames.method4854(var0).pixels); // L: 19 20
	}
}
