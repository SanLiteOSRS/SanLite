import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lld;"
	)
	static final PrivateChatMode field3822;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lld;"
	)
	public static final PrivateChatMode field3821;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lld;"
	)
	static final PrivateChatMode field3823;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2012095045
	)
	public final int field3824;

	static {
		field3822 = new PrivateChatMode(0);
		field3821 = new PrivateChatMode(1);
		field3823 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field3824 = var1;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		signature = "(Lbf;I)Z",
		garbageValue = "200454944"
	)
	static boolean method6022(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (WorldMapLabelSize.localPlayer == var0) {
			return TileItem.method2208();
		} else {
			boolean var1 = LoginPacket.method3707() || Client.method1792() && var0.isFriend();
			if (!var1) {
				boolean var2 = (Client.drawPlayerNames & 2) != 0;
				var1 = var2 && var0.isClanMember();
			}

			return var1;
		}
	}
}
