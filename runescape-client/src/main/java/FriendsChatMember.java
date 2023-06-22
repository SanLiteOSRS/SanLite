import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("FriendsChatMember")
public class FriendsChatMember extends Buddy {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("ignored")
	TriBool ignored;

	FriendsChatMember() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1080675170"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) { // L: 16
			this.fillIsFriend(); // L: 17
		}

		return this.friend == TriBool.TriBool_true; // L: 19
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-132536073"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = ApproximateRouteStrategy.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "44"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) { // L: 31
			this.fillIsIgnored(); // L: 32
		}

		return this.ignored == TriBool.TriBool_true; // L: 34
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532004625"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = ApproximateRouteStrategy.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39
}
