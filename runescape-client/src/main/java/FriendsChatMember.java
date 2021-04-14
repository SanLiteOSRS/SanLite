import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("FriendsChatMember")
public class FriendsChatMember extends Buddy {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("ignored")
	TriBool ignored;

	FriendsChatMember() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "9619"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "253215960"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "24"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class13.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2042295108"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1304544049"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "1"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class13.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}
}
