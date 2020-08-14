class TicketNotFoundException extends Exception{

		
	private static final long serialVersionUID = 1L;

		public TicketNotFoundException() {
		super("Out of Stock");
		}
		}
     class BookMyShow
		{
			static int availabletickets=10;
			
			
		void bookTicket(int NoOfTickets)throws TicketNotFoundException
		{
			
		if(NoOfTickets >  availabletickets )
		{
		throw new TicketNotFoundException();
		}

		else
		{
			availabletickets= availabletickets-NoOfTickets;
			
		System.out.println(NoOfTickets +" tickets Booked enjoy the show available tickets " + availabletickets);
		}
		}

		}

