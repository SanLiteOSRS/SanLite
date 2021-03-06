import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("FriendsChatMember")
public class FriendsChatMember extends Buddy {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lka;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lka;"
	)
	@Export("ignored")
	TriBool ignored;

	FriendsChatMember() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1122963499",
		signature = "(I)V"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-1693898868",
		signature = "(I)Z"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-932162684",
		signature = "(I)V"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = InterfaceParent.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1113333247",
		signature = "(I)V"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-1838909924",
		signature = "(I)Z"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "-1629114941",
		signature = "(I)V"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = InterfaceParent.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}
}
