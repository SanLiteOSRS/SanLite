import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("FriendsChatMember")
public class FriendsChatMember extends Buddy {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("ignored")
	TriBool ignored;

	FriendsChatMember() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-2883"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "935555842"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = GameEngine.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1459328233"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-463248448"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = GameEngine.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-714139435"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
