import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("es")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("e")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("v")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -4969034956878830265L
	)
	long field82;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 491316409
	)
	int field83;
	@ObfuscatedName("o")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1000479447
	)
	int field85;
	@ObfuscatedName("r")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("h")
	public byte field87;
	@ObfuscatedName("d")
	public byte field88;
	@ObfuscatedName("z")
	public byte field93;
	@ObfuscatedName("b")
	public byte field90;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2137509015
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("k")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("g")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("t")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("x")
	int[] field95;
	@ObfuscatedName("u")
	public int[] field96;
	@ObfuscatedName("q")
	public boolean[] field97;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 159638309
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1730061339
	)
	public int field99;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1156384829
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("n")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("l")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("w")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field83 = 0;
		this.name = null;
		this.field85 = 0;
		this.currentOwner = -1;
		this.field99 = -1;
		this.method139(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "85"
	)
	void method121(int var1) {
		if (this.useHashes) {
			if (this.memberHashes != null) {
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1];
		}

		if (this.field95 != null) {
			System.arraycopy(this.field95, 0, this.field95 = new int[var1], 0, this.memberCount);
		} else {
			this.field95 = new int[var1];
		}

		if (this.field96 != null) {
			System.arraycopy(this.field96, 0, this.field96 = new int[var1], 0, this.memberCount);
		} else {
			this.field96 = new int[var1];
		}

		if (this.field97 != null) {
			System.arraycopy(this.field97, 0, this.field97 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field97 = new boolean[var1];
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	void method122(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1805753468"
	)
	public int method196(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.memberCount; ++var2) {
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "942586664"
	)
	public int method170(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field95[var1] & var4) >>> var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "1522777048"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "284711129"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
				var1[var2] = this.memberNames[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.sortedMembers;
			class215.method4434(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "-1360534257"
	)
	void method126(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method121(this.memberCount + 5);
			}

			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126;
			} else {
				this.memberRanks[this.memberCount] = 0;
			}

			this.field95[this.memberCount] = 0;
			this.field96[this.memberCount] = var4;
			this.field97[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1830221034"
	)
	void method127(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field95 = null;
				this.field96 = null;
				this.field97 = null;
				this.currentOwner = -1;
				this.field99 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field95, var1 + 1, this.field95, var1, this.memberCount - var1);
				System.arraycopy(this.field96, var1 + 1, this.field96, var1, this.memberCount - var1);
				System.arraycopy(this.field97, var1 + 1, this.field97, var1, this.memberCount - var1);
				if (this.memberHashes != null) {
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) {
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1260147822"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field99 = -1;
		} else {
			this.currentOwner = -1;
			this.field99 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field99 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field99 == -1 && this.memberRanks[var3] == 125) {
					this.field99 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "1778861345"
	)
	void method129(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method122(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) {
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) {
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1142795172"
	)
	void method124(int var1) {
		--this.bannedMemberCount;
		if (this.bannedMemberCount == 0) {
			this.bannedMemberHashes = null;
			this.bannedMemberNames = null;
		} else {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-604206368"
	)
	int method131(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field99 == -1 || this.memberRanks[this.field99] < 125)) {
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1;
			} else {
				this.memberRanks[var1] = var2;
				this.updateOwner();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-113"
	)
	boolean method132(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field99 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "49052820"
	)
	int method133(int var1, boolean var2) {
		if (this.field97[var1] == var2) {
			return -1;
		} else {
			this.field97[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-61"
	)
	int method128(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field95[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field95[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "65280"
	)
	boolean method188(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
					if (var2 == var4.integer) {
						return false;
					}

					var4.integer = var2;
					return true;
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "-43"
	)
	boolean method136(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.parameters != null) {
			Node var8 = this.parameters.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
					if ((var9.integer & var7) == var2) {
						return false;
					}

					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}

				var8.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("u")
	boolean method137(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class350) {
					class350 var5 = (class350)var4;
					if (var5.field3932 == var2) {
						return false;
					}

					var5.field3932 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new class350(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "1757759616"
	)
	boolean method138(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove();
						this.parameters.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-750951939"
	)
	void method139(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) {
				this.useNames = true;
			}

			if (!this.useHashes) {
				this.memberHashes = null;
				this.bannedMemberHashes = null;
			}

			if (!this.useNames) {
				this.memberNames = null;
				this.bannedMemberNames = null;
			}

			this.field83 = var1.readInt();
			this.field85 = var1.readInt();
			if (var2 <= 3 && this.field85 != 0) {
				this.field85 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field87 = var1.readByte();
			this.field88 = var1.readByte();
			this.field93 = var1.readByte();
			this.field90 = var1.readByte();
			int var4;
			if (this.memberCount > 0) {
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field95 == null || this.field95.length < this.memberCount) {
					this.field95 = new int[this.memberCount];
				}

				if (this.field96 == null || this.field96.length < this.memberCount) {
					this.field96 = new int[this.memberCount];
				}

				if (this.field97 == null || this.field97.length < this.memberCount) {
					this.field97 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) {
					if (this.useHashes) {
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field95[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field96[var4] = var1.readUnsignedShort();
					} else {
						this.field96[var4] = 0;
					}

					if (var2 >= 6) {
						this.field97[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field97[var4] = false;
					}
				}

				this.updateOwner();
			}

			if (this.bannedMemberCount > 0) {
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) {
					if (this.useHashes) {
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					this.parameters = new IterableNodeHashTable(var4 < 16 ? UrlRequester.method2504(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), (long)var6);
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class350(var10), (long)var6);
						} else if (var7 == 2) {
							String var8 = var1.readStringCp1252NullTerminated();
							this.parameters.put(new ObjectNode(var8), (long)var6);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;B)V",
		garbageValue = "-16"
	)
	public static void method203(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		class378.HitSplatDefinition_spritesArchive = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1865027594"
	)
	public static int method200() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1382851298"
	)
	static final void method201(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		UserComparator10.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1255616789"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class4.clientPreferences.soundEffectsVolume != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
