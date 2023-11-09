import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("z")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("a")
	@Export("state")
	byte state;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -458057451
	)
	@Export("id")
	public int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1108856585
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -357398681
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1330278359
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1218399159
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lqr;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1504691178"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1785756746"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1071112959"
	)
	void method6518(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1594456124"
	)
	void method6512(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "884211130"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 152
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1309767599"
	)
	static final void method6524() {
		Client.field702 = Client.cycleCntr; // L: 12506
		UserComparator8.FriendsChatManager_inFriendsChat = true; // L: 12507
	} // L: 12508
}
