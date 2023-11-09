import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("FriendsChatMember")
public class FriendsChatMember extends Buddy {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("ignored")
	TriBool ignored;

	FriendsChatMember() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
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
		garbageValue = "713912709"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class6.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "613175438"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "63"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) { // L: 31
			this.fillIsIgnored(); // L: 32
		}

		return this.ignored == TriBool.TriBool_true; // L: 34
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "193686662"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class6.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class60.method1159(); // L: 8674
		Client.menuActions[0] = "Cancel"; // L: 8675
		Client.menuTargets[0] = ""; // L: 8676
		Client.menuOpcodes[0] = 1006; // L: 8677
		Client.menuShiftClick[0] = false; // L: 8678
		Client.menuOptionsCount = 1; // L: 8679
	} // L: 8680
}
